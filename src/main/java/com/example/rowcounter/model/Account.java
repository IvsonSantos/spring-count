package com.example.rowcounter.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name="ACCOUNTS")
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "accounts_seq")
    @SequenceGenerator(name = "accounts_seq", sequenceName = "accounts_seq", allocationSize = 1)
    @Column(name = "user_id")
    private int userId;
    private String username;
    private String password;
    private String email;
    private LocalDateTime createdOn;
    private LocalDateTime lastLogin;

    @OneToOne
    @JoinColumn(name = "permissions_id")
    private Permission permission;
}
