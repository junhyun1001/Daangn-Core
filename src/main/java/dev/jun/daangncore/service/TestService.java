package dev.jun.daangncore.service;

import dev.jun.daangncore.domain.Test;
import dev.jun.daangncore.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;

    public List<Test> findAll() {
        return testRepository.findAll();
    }
}
