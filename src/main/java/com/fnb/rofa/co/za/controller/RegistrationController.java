package com.fnb.rofa.co.za.controller;

import com.fnb.rofa.co.za.model.User;
import com.fnb.rofa.co.za.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/fnb/")
public class RegistrationController {

    private final UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("user/save")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @GetMapping("user/list")
    public List<User> findAll() {
        return userService.findAll();
    }
}
