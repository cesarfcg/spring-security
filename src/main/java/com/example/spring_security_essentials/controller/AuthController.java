package com.example.spring_security_essentials.controller;

import com.example.spring_security_essentials.model.User;
import com.example.spring_security_essentials.service.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final RegisterService registerService;
    private final AuthenticationManager authenticationManager;


    @PostMapping("/login")
    public String login(@RequestBody User user){
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getEmail(),user.getPassword()));
        return "User autenticado.";
    }

    @PostMapping("/register")
    public String register(@RequestBody User user){
        registerService.register(user);
        return "User criado";

    }
}
