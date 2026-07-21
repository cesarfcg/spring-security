package com.example.spring_security_essentials.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    @GetMapping("/public")
    public String publicRoute(){
        return "<h1>public page</h1>";
    }

    @GetMapping("private")
    public String privateRoute(){
        return "<h1>private page</h1>";
    }
}
