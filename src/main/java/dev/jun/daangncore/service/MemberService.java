package dev.jun.daangncore.service;

import dev.jun.daangncore.entity.CustomUserDetails;
import dev.jun.daangncore.entity.Member;
import dev.jun.daangncore.entity.Region;
import dev.jun.daangncore.entity.dto.request.SignupDto;
import dev.jun.daangncore.repository.MemberRepository;
import dev.jun.daangncore.repository.RegionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService implements UserDetailsService {

    private final PasswordEncoder passwordEncoder;
    private final MemberRepository memberRepository;
    private final RegionRepository regionRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Member member = memberRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("해당 이메일의 회원이 존재하지 않습니다. "));

        return new CustomUserDetails(member);
    }

    @Transactional
    public Member saveMember(SignupDto signupDto) {

        String encodedPassword = passwordEncoder.encode(signupDto.getPassword());

        Region region = regionRepository.findById(signupDto.getRegionId()).orElseThrow();

        Member member = Member.builder()
                .email(signupDto.getEmail())
                .password(encodedPassword)
                .nickname(signupDto.getNickname())
                .region(region)
                .build();

        return memberRepository.save(member);
    }
}
