package com.example.rowcounter.repository;

import com.example.rowcounter.model.Account;
import com.example.rowcounter.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface PermissionRepository extends JpaRepository<Permission, Integer> {

    Permission findByType(String type);

}