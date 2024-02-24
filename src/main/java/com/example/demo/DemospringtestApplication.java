package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DemospringtestApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DemospringtestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "INSERT INTO tbl_userinfo (id, uname, pwd, role) VALUES (?, ?, ?, ?)";

		int result = jdbcTemplate.update(sql, 2, "Kumar", "Kumar", "Developer");

		if (result > 0) {
			System.out.println("A new row has been inserted.");
		}
	}
}
