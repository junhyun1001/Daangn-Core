package dev.jun.daangncore.service;

import dev.jun.daangncore.entity.Member;
import dev.jun.daangncore.entity.dto.request.SignupForm;
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
    public void saveMember(SignupForm signupForm) {

        String encodedPassword = passwordEncoder.encode(signupForm.getPassword());

        Member member = Member.builder()
                .email(signupForm.getEmail())
                .password(encodedPassword)
                .nickname(signupForm.getNickname())
                .build();

        memberRepository.save(member);
    }
}
