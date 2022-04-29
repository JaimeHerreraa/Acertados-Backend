package com.example.reto.controllers;

import com.example.reto.models.User;
import com.example.reto.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "users")
public class UserController {
    private UserService service;
    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/endgame")
    public User endgame(@RequestBody User user) {
        return service.saveUser(user);
    }
}