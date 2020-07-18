package com.clayn.mmeserver.controller;

import com.clayn.mmeserver.model.User;
import com.clayn.mmeserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public String registerUser(@RequestBody User user){
        return userService.createUser(user);
    }
}
