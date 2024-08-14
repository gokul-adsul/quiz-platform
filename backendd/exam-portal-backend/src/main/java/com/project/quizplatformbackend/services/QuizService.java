package com.project.quizplatformbackend.services;

import java.util.List;

import com.project.quizplatformbackend.models.Category;
import com.project.quizplatformbackend.models.Quiz;


public interface QuizService {

    Quiz addQuiz(Quiz quiz);

    List<Quiz> getQuizzes();

    Quiz getQuiz(Long quizId);

    Quiz updateQuiz(Quiz quiz);

    void deleteQuiz(Long quizId);

    // Extra methods
    List<Quiz> getQuizByCategory(Category category);
}
