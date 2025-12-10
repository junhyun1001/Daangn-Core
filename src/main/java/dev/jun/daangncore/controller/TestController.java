package dev.jun.daangncore.controller;

import dev.jun.daangncore.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping
    public String test(Model model) {
        model.addAttribute("test", testService.findAll());
        return "test.html";
    }
}
