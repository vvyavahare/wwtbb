package org.wwtbb.service;

import org.springframework.stereotype.Service;

@Service
public interface CurrencyExchangeService {
    CurrencyExchange findByFromAndTo(String from, String to);
}
