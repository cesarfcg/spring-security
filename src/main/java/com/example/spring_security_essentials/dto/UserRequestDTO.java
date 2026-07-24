package com.example.spring_security_essentials.dto;

import jakarta.validation.constraints.NotBlank;

public record UserRequestDTO(@NotBlank String email, @NotBlank String password) {
}
