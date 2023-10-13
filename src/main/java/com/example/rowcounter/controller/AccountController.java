package com.example.rowcounter.controller;

import com.example.rowcounter.model.Account;
import com.example.rowcounter.repository.AccountRepository;
import com.example.rowcounter.service.AccountStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping
public class AccountController {

    @Autowired
    private AccountStatsService service;

    @Autowired
    private AccountRepository repository;

    @GetMapping("/count")
    public ResponseEntity<Long> getNumber() {

        Account account = Account.builder()
                .email("teste@test.com")
                .build();
        Account account2 = Account.builder()
                .email("teste@test.com")
                .build();
        Account account3 = Account.builder()
                .email("teste@test.com")
                .build();
        repository.saveAll(Arrays.asList(account, account2, account3));

        return ResponseEntity.ok(service.getAccountCount());
    }
}
