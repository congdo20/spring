package com.trinhdo.identityservice.controller;

import com.trinhdo.identityservice.dto.request.UserCreationRequest;
import com.trinhdo.identityservice.entity.User;
import com.trinhdo.identityservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    User createUser(@RequestBody UserCreationRequest request) {
        return userService.createUser(request);
    }

    @GetMapping
    List<User> getUsers() {
        return userService.getUsers();
    }
}
