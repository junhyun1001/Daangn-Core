package dev.jun.daangncore.service;

import dev.jun.daangncore.domain.Test;
import dev.jun.daangncore.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestMapper testMapper;

    public List<Test> findAll() {
        return testMapper.findAll();
    }
}
