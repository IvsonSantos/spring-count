package com.example.rowcounter.repository;

import com.example.rowcounter.model.Account;
import com.example.rowcounter.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface AccountRepository extends JpaRepository<Account, Integer> {

    long countByUsername(String username);

    long countByPermission(Permission permission);

    long countByPermissionAndCreatedOnGreaterThan(Permission permission, LocalDateTime ts);
}