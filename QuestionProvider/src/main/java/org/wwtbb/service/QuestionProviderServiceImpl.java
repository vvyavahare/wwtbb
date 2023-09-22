package org.wwtbb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wwtbb.data.QuestionProviderDTO;
import org.wwtbb.mappers.QuestionProviderMapper;
import org.wwtbb.repository.QuestionProviderRepository;

import java.util.List;

@Service
public class QuestionProviderServiceImpl implements QuestionProviderService {
    @Autowired
    QuestionProviderRepository repository;

    @Override
    public List<QuestionProviderDTO> getAllQuestions() {
        return QuestionProviderMapper.INSTANCE.toDTOList(repository.findAll());
    }
}
