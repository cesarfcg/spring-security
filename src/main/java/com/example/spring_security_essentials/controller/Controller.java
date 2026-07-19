package com.example.spring_security_essentials.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class Controller {
    @GetMapping("/public")
    public String initial(){
        return "<h1>public page</h1>";
    }
}
