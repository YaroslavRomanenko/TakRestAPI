package com.yarikcompany.tak.service;

import com.yarikcompany.tak.entity.User;
import com.yarikcompany.tak.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class UserService {

    UserRepository repo;

    @Autowired
    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User getUserById(String id) {
        Optional<User> optionalUser = repo.findById(id);

        return optionalUser.orElse(null);
    }

    public void setUser(User user) {

        repo.save(user);
    }
}
