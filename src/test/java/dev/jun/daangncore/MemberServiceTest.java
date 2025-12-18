package dev.jun.daangncore;

import dev.jun.daangncore.entity.Member;
import dev.jun.daangncore.entity.Region;
import dev.jun.daangncore.entity.dto.request.SignupDto;
import dev.jun.daangncore.repository.MemberRepository;
import dev.jun.daangncore.repository.RegionRepository;
import dev.jun.daangncore.service.MemberService;
import dev.jun.daangncore.service.RegionService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class MemberServiceTest {

    @Autowired
    private RegionRepository regionRepository;
    @Autowired
    private RegionService regionService;
    @Autowired
    private MemberService memberService;
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    @DisplayName("회원가입 성공")
    void signup_success() {
        // given (준비)
        Region region = regionRepository.findById(144L).orElseThrow(() -> new IllegalStateException("테스트용 Region 데이터가 없습니다."));

        SignupDto signupDto = new SignupDto();
        signupDto.setEmail("test@test.com");
        signupDto.setPassword("test1234");
        signupDto.setNickname("닉네임테스트");
        signupDto.setRegionId(region.getId());

        // when (실행)
        Member savedMember = memberService.saveMember(signupDto);

        // then (검증)
        // 회원 정보가 DB에 반영되었는지 확인
        memberRepository.findById(savedMember.getId()).orElseThrow();

        // 회원의 지역 정보가 잘 들어갔는지 확인
        assertThat(savedMember.getRegion()).isEqualTo(region);

        // 비밀번호 암호화 확인
        assertThat(passwordEncoder.matches(signupDto.getPassword(), savedMember.getPassword())).isTrue();
    }

}
