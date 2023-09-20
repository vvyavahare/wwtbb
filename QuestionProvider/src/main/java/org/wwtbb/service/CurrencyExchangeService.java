package org.wwtbb.service;

import org.springframework.stereotype.Service;
import org.wwtbb.data.CurrencyExchange;
import org.wwtbb.data.CurrencyExchangeDTO;
@Service
public interface CurrencyExchangeService {
    CurrencyExchange findByFromAndTo(String from, String to);
}
