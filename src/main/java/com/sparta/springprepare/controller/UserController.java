package com.sparta.springprepare.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {
    @GetMapping("/login")
    public String login() {
        return "Hi";
    }


}
