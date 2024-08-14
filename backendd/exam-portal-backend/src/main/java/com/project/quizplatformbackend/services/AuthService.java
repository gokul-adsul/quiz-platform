package com.project.quizplatformbackend.services;

import com.project.quizplatformbackend.models.LoginRequest;
import com.project.quizplatformbackend.models.LoginResponse;
import com.project.quizplatformbackend.models.User;

public interface AuthService {
    User registerUserService(User user) throws Exception;

    LoginResponse loginUserService(LoginRequest loginRequest) throws Exception;
}
