package com.project.quizplatformbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.quizplatformbackend.models.LoginRequest;
import com.project.quizplatformbackend.models.LoginResponse;
import com.project.quizplatformbackend.models.User;
import com.project.quizplatformbackend.services.AuthService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    AuthService authService;


    @PostMapping("/register")
    public User registerUser(@RequestBody User user) throws Exception {
        return authService.registerUserService(user);
    }

    @PostMapping("/login")
    public LoginResponse loginUser(@RequestBody LoginRequest loginRequest) throws Exception {
        return authService.loginUserService(loginRequest);
    }

}
