package com.yarikcompany.tak.controller;

import com.yarikcompany.tak.entity.User;
import com.yarikcompany.tak.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {

    UserService userService;

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/test")
    public ResponseEntity<Map<String, String>> getTest() {
        Map<String, String> testMap = new HashMap<>();
        testMap.put("message", "Testing...");
        return ResponseEntity.ok(testMap);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable String id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @PostMapping("/user/addUser")
    public void setUser(@RequestBody User user) {
        System.out.println(user);
        userService.setUser(user);
    }
}
