package org.wwtbb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wwtbb.data.QuestionProviderDTO;
import org.wwtbb.service.QuestionProviderService;

import java.util.List;

@RestController
public class QuestionProviderController {
    private final Logger logger = LoggerFactory.getLogger(QuestionProviderController.class);

    @Autowired
    private Environment environment;

    @Autowired
    private QuestionProviderService questionProviderService;


    @GetMapping("/questions")
    public List<QuestionProviderDTO> getAllQuestions() {
        List<QuestionProviderDTO> questions = questionProviderService.getAllQuestions();
        logger.info("All question => {}", questions);

        return questions;
    }

    private void fn(){
        int c = 5;
        int b = 2;
    }
}


