package com.example.rowcounter.controller;

import com.example.rowcounter.model.Account;
import com.example.rowcounter.repository.AccountRepository;
import com.example.rowcounter.service.AccountStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.Arrays;

@RestController
@RequestMapping
public class AccountController {

    @Autowired
    private AccountStatsService service;

    @GetMapping("/count")
    public ResponseEntity<Long> getNumber() {
        return ResponseEntity.ok(service.getAccountCount());
    }

    @GetMapping("/countByName")
    public ResponseEntity<Long> countByName() {
        return ResponseEntity.ok(service.getAccountCountByUsername());
    }

    @GetMapping("/getAccountCountByPermissionAndCreatedOn")
    public ResponseEntity<Long> getAccountCountByPermissionAndCreatedOn() throws ParseException {
        return ResponseEntity.ok(service.getAccountCountByPermissionAndCreatedOn());
    }

    @GetMapping("/getAccountsByJPQL")
    public ResponseEntity<Long> getAccountsByJPQL() throws ParseException {
        return ResponseEntity.ok(service.getAccountsByJPQL());
    }
}
