package org.wwtbb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wwtbb.data.QuestionProviderDTO;
import org.wwtbb.service.CurrencyExchangeService;
import org.wwtbb.service.QuestionProviderService;

import java.util.List;

@RestController
public class QuestionProviderController {
    private Logger logger = LoggerFactory.getLogger(QuestionProviderController.class);

    @Autowired
    private Environment environment;

    @Autowired
    private CurrencyExchangeService service;

    @Autowired
    private QuestionProviderService questionProviderService;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public void retrieveExchangeValue(
            @PathVariable String from,
            @PathVariable String to) {

        logger.info("retrieveExchangeValue called with {} to {}", from, to);
        CurrencyExchange currencyExchange = service.findByFromAndTo(from, to);
        logger.info("currencyExchange= {}", currencyExchange);
        logger.info("currencyExchange->getConversionMultiple= {}", currencyExchange.getConversionMultiple());
    }

    @GetMapping("/questions")
    public List<QuestionProviderDTO> getAllQuestions() {
        List<QuestionProviderDTO> questions = questionProviderService.getAllQuestions();
        logger.info("All question => {}", questions);

        return questions;
    }
}


