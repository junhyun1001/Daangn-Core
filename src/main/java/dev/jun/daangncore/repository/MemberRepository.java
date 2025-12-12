package dev.jun.daangncore.repository;

import dev.jun.daangncore.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
