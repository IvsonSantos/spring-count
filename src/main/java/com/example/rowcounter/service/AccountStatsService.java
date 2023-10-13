package com.example.rowcounter.service;

import com.example.rowcounter.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountStatsService {

    @Autowired
    private AccountRepository accountRepository;

    public long getAccountCount(){
        return accountRepository.count();
    }

}
