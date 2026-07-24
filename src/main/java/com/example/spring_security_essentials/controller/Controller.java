package com.example.spring_security_essentials.controller;

import com.example.spring_security_essentials.model.User;
import com.example.spring_security_essentials.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class Controller {
    private final UserRepository userRepository;
    @GetMapping("/public")
    public String publicRoute(){
        return "<h1>public page</h1>";
    }

    @GetMapping("/admin")
    public String adminRoute(){
        return "<h1>Admin page</h1>";
    }

    @GetMapping("private")
    public String privateRoute(){
        return "<h1>private page</h1>";
    }
    @GetMapping("/list")
    public List<User> users(){
        return userRepository.findAll();
    }
}
