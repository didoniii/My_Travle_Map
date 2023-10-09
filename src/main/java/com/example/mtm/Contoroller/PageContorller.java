package com.example.mtm.Contoroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageContorller {
    @GetMapping("/")
    public String openLogin() {
        return "redirect:login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

}
