package com.project.quizplatformbackend.services;

import java.util.List;

import com.project.quizplatformbackend.models.Question;
import com.project.quizplatformbackend.models.Quiz;

public interface QuestionService {

    Question addQuestion(Question question);

    List<Question> getQuestions();

    Question getQuestion(Long quesId);

    Question updateQuestion(Question question);

    void deleteQuestion(Long questionId);

  
    List<Question> getQuestionsByQuiz(Quiz quiz);

}
