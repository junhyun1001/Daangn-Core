package dev.jun.daangncore.repository;

import dev.jun.daangncore.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestRepository extends JpaRepository<Test, Long> {

    List<Test> findAll();
}
