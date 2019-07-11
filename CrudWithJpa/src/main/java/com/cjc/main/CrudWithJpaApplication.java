package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com")
public class CrudWithJpaApplication {

	public static void main(String[] args) {
		System.out.println("Hiii In crud ");
		SpringApplication.run(CrudWithJpaApplication.class, args);
	}

}
