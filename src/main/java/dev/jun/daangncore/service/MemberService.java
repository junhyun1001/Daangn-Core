package dev.jun.daangncore.service;

import dev.jun.daangncore.entity.Member;
import dev.jun.daangncore.entity.dto.request.SignupDto;
import dev.jun.daangncore.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public void saveMember(SignupDto signupDto) {

        String encodedPassword = passwordEncoder.encode(signupDto.getPassword());

        Member member = Member.builder()
                .email(signupDto.getEmail())
                .password(encodedPassword)
                .nickname(signupDto.getNickname())
                .build();

        memberRepository.save(member);
    }
}
