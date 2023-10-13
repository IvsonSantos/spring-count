package com.example.rowcounter;

import com.example.rowcounter.model.Account;
import com.example.rowcounter.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class RowCounterApplication implements CommandLineRunner {

	@Autowired
	private AccountRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(RowCounterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Account account = Account.builder()
				.username("user1")
				.email("teste@test.com")
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
