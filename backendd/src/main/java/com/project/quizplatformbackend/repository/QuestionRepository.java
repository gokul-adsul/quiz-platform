package com.project.quizplatformbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.quizplatformbackend.models.Question;
import com.project.quizplatformbackend.models.Quiz;

import java.util.List;


public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByQuiz(Quiz quiz);
}
