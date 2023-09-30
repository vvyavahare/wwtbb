package org.wwtbb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wwtbb.data.CurrencyExchange;
import org.wwtbb.data.CurrencyExchangeDTO;
import org.wwtbb.repository.CurrencyExchangeRepository;

@Service
public class CurrencyExchangeServiceImpl implements CurrencyExchangeService {
    @Autowired
    CurrencyExchangeRepository repository;

    @Override
    public CurrencyExchange findByFromAndTo(String from, String to) {
//        callCustomFn();
        return repository.findByFromAndTo(from, to);
    }

    private void callCustomFn() {
        int a = 5 + 6;
        int b = 6 + 7;
        int c = a + b;
        System.out.println("c = " + c);
    }
}
