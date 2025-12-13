package dev.jun.daangncore.controller;

import dev.jun.daangncore.entity.dto.request.SignupForm;
import dev.jun.daangncore.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping
    public String signup(Model model) {
        model.addAttribute("signupForm", new SignupForm());
        return "member/signup.html";
    }

    @PostMapping("/signup")
    public String signup(@Valid @ModelAttribute SignupForm signupForm, BindingResult result) {

        memberService.saveMember(signupForm);

        if (result.hasErrors()) {
            return "member/signup.html";
        }

        return "redirect:/";
    }

}
