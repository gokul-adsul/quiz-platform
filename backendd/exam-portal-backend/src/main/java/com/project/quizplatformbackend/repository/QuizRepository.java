package com.project.quizplatformbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.quizplatformbackend.models.Category;
import com.project.quizplatformbackend.models.Quiz;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
    List<Quiz> findByCategory(Category category);
}
