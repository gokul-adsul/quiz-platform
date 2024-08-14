package com.project.quizplatformbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.quizplatformbackend.models.Role;

public interface RoleRepository extends JpaRepository<Role, String> {
}
