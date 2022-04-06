package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CruDinPostgreSqlApplication implements CommandLineRunner {

	@Autowired
	private Studentdao studentdao;

	public static void main(String[] args) {
		SpringApplication.run(CruDinPostgreSqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		this.studentdao.createTable();
		this.studentdao.insertData("mayank","ahmedabad");
	}


}
