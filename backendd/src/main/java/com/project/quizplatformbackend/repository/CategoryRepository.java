package com.project.quizplatformbackend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.project.quizplatformbackend.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
