package com.example.reto.controllers;

import com.example.reto.models.Choice;
import com.example.reto.models.Question;
import com.example.reto.services.QuestionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "categories")
public class CategoryController {
    private QuestionService service;
    public CategoryController(QuestionService service) {
        this.service = service;
    }

    @GetMapping("/{id}/questions")
    public Question queryQuestion(@PathVariable("id") Long id) {
        return service.getCategory(id);
    }

    @PostMapping("/{id}/questions/{questionId}")
    public String answerQuestion(@PathVariable("id") Long id, @PathVariable("questionId") Long questionId, @RequestBody Choice choice) {
        return service.answerQuestion(id, questionId, choice);
    }

}