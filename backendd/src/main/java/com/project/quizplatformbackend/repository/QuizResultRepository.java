package com.project.quizplatformbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.quizplatformbackend.models.QuizResult;

import java.util.List;

public interface QuizResultRepository extends JpaRepository<QuizResult, Long> {
    List<QuizResult> findByUserId(Long userId);
}
