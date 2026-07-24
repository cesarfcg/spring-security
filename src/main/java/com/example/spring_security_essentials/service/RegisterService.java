package com.example.spring_security_essentials.service;

import com.example.spring_security_essentials.dto.UserDTO;
import com.example.spring_security_essentials.model.User;
import com.example.spring_security_essentials.model.UserRole;
import com.example.spring_security_essentials.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    public void register(UserDTO userDTO){
        User user = new User();
        user.setEmail(userDTO.email());
        user.setPassword(passwordEncoder.encode(userDTO.password()));
        user.setRole(UserRole.USER);
        userRepository.save(user);
    }
}
