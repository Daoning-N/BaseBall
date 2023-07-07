package com.baseballproject.Login;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MemberController {

    
    private final MemberService memberService;

    
    @GetMapping("/signup")
    public String saveForm() {
        return "/signup";
    }

    @PostMapping("/signup")    
    public String save(@ModelAttribute MemberDTO memberDTO) {
        System.out.println("MemberController.save");
        System.out.println("memberDTO = " + memberDTO);
        memberService.save(memberDTO);

        return "/index";
    }
    
    @GetMapping("/login")
    public String loginForm(){
        return "/login";
    }


    @PostMapping("/login") // session : 로그인 유지
    public String login(@ModelAttribute MemberDTO memberDTO, HttpSession session) {
        MemberDTO loginResult = memberService.login(memberDTO);
        if (loginResult != null) {
            // login 성공
            session.setAttribute("loginEmail", loginResult.getMemberEmail());
            return "/index";
        } else {
            // login 실패
            return "/login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // 세션에서 로그인 정보를 삭제하고 로그아웃 처리합니다.
        session.invalidate();
        return "redirect:./"; // 로그아웃 후 로그인 페이지로 이동합니다.
    }
}