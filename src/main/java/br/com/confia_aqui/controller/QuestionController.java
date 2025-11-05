package br.com.confia_aqui.controller;


import br.com.confia_aqui.Question;
import br.com.confia_aqui.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    //req get para todas as questions
    @GetMapping("allQuestions")
    public List<Question> getAllQuestions(){
         return questionService.getAllQuestions();
        //repare, mesmo metodo getAllQuestions

    }

    //req get para uma categoria específica
    @GetMapping("category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category){
    return questionService.getQuestionsByCategory(category);

    }



}