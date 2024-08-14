package com.project.quizplatformbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.quizplatformbackend.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
