package org.example.authorization.controller;

import org.example.authorization.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class TestController {
    @GetMapping("/hello")
    public User getAuthorities() {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Custom not found");
    }
}
