package com.ramshakhanhere.springbootactuator.controller;

import com.ramshakhanhere.springbootactuator.model.User;
import com.ramshakhanhere.springbootactuator.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUser(){
        return userService.getAllUsers();
    }
}
