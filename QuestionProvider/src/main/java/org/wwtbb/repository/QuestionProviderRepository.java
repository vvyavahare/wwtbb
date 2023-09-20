package org.wwtbb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.wwtbb.data.CurrencyExchange;
import org.wwtbb.data.Question;

import java.util.List;

@Repository
public interface QuestionProviderRepository
        extends JpaRepository<Question, Long> {
    @Override
    List<Question> findAll();
}