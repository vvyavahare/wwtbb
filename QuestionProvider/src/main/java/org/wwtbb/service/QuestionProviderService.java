package org.wwtbb.service;

import org.springframework.stereotype.Service;
import org.wwtbb.data.QuestionProviderDTO;

import java.util.List;

@Service
public interface QuestionProviderService {
    List<QuestionProviderDTO> getAllQuestions();
}
