package com.example.spring_security_essentials.controller;

import com.example.spring_security_essentials.dto.UserRequestDTO;
import com.example.spring_security_essentials.service.RegisterService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final RegisterService registerService;
    private final AuthenticationManager authenticationManager;


    @PostMapping("/register")
    public ResponseEntity<Void> register(@Valid @RequestBody UserRequestDTO user){
        registerService.register(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }
}
