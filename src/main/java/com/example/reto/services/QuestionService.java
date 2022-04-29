package com.example.reto.services;

import com.example.reto.models.Category;
import com.example.reto.models.Choice;
import com.example.reto.models.Question;
import com.example.reto.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    private final CategoryRepository repository;

    public QuestionService(CategoryRepository repository) {
        this.repository = repository;
    }

    public Question getCategory(Long id) {
        return repository
                .findById(id)
                .map(categoryEntity -> getRandomQuestion(categoryEntity.getQuestions()))
                .orElse(null);
    }

    public Question getRandomQuestion(List<Question> questions) {
        int random = (int)(Math.random() * (questions.size() - 1));
        return questions.get(random);
    }

    public String answerQuestion(Long id, Long questionId, Choice choice) {
        Category category = repository.findById(id).orElseThrow(IllegalAccessError::new);

        Question question = category.getQuestions().stream().filter(quest -> quest.getId().equals(questionId)).findAny()
                .orElseThrow(IllegalAccessError::new);

        if (question.getCorrectAnswerId().equals(choice.getId())) {
            return "good job!";
        }
        return "wrong answer picked";
    }
}