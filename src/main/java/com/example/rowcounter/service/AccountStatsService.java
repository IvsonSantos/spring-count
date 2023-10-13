package com.example.rowcounter.service;

import com.example.rowcounter.model.Permission;
import com.example.rowcounter.repository.AccountRepository;
import com.example.rowcounter.repository.PermissionRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.time.LocalDateTime;

@Service
public class AccountStatsService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private PermissionRepository permissionRepository;

    @Autowired
    private EntityManager entityManager;

    public long getAccountCount(){
        return accountRepository.count();
    }

    public long getAccountCountByUsername(){
        String username = "user2";
        return accountRepository.countByUsername(username);
    }

    public long getAccountCountByPermissionAndCreatedOn() throws ParseException {
        Permission permission = permissionRepository.findByType("reader");
        return accountRepository.countByPermissionAndCreatedOnGreaterThan(permission, LocalDateTime.now());
    }

    public long getAccountsByJPQL() throws ParseException {
        Query query = entityManager.createQuery("SELECT COUNT(*) FROM Account a");
        return (long) query.getSingleResult();
    }

}
