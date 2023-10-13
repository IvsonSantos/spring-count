package com.example.rowcounter;

import com.example.rowcounter.model.Account;
import com.example.rowcounter.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RowCounterApplication  {

	public static void main(String[] args) {
		SpringApplication.run(RowCounterApplication.class, args);
	}

}
