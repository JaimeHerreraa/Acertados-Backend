package com.example.reto.services;

import com.example.reto.models.User;
import com.example.reto.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User saveUser(User user) {
        return repository.save(user);
    }
}