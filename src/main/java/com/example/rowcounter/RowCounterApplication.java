package com.example.rowcounter;

import com.example.rowcounter.model.Account;
import com.example.rowcounter.model.Permission;
import com.example.rowcounter.repository.AccountRepository;
import com.example.rowcounter.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.Arrays;

@SpringBootApplication
public class RowCounterApplication implements CommandLineRunner {

	@Autowired
	private AccountRepository repository;

	@Autowired
	private PermissionRepository permissionRepository;

	public static void main(String[] args) {
		SpringApplication.run(RowCounterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Permission permission = Permission.builder().type("type1").build();
		permissionRepository.save(permission);

		Account account = Account.builder()
				.username("user1")
				.email("teste@test.com")
				.permission(permission)
				.createdOn(LocalDateTime.of(2010, 1, 1, 9, 30))
				.build();
		Account account2 = Account.builder()
				.username("user2")
				.email("teste@test.com")
				.build();
		Account account3 = Account.builder()
				.username("user3")
				.email("teste@test.com")
				.build();


		repository.saveAll(Arrays.asList(account, account2, account3));
	}
}
