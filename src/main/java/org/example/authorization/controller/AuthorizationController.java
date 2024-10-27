package org.example.authorization.controller;

import org.example.authorization.enums.Authorities;
import org.example.authorization.service.AuthorizationService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class AuthorizationController {
    AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        //return service.getAuthorities(user, password);
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "tuturu");
    }
}
