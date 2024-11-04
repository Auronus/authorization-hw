package org.example.authorization.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.example.authorization.dto.User;
import org.example.authorization.enums.Authorities;
import org.example.authorization.service.AuthorizationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class AuthorizationController {
    AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid User user) {
        return service.getAuthorities(user);
    }
}
