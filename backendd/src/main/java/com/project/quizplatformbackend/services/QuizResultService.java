package com.project.quizplatformbackend.services;

import java.util.List;

import com.project.quizplatformbackend.models.QuizResult;

public interface QuizResultService {
    QuizResult addQuizResult(QuizResult quizResult);
    List<QuizResult> getQuizResults();

    List<QuizResult> getQuizResultsByUser(Long userId);
}

