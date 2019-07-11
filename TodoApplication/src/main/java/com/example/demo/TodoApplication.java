package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com")
public class TodoApplication {

	public static void main(String[] args) {
		System.out.println("Welcome in Todo Application..........");
		SpringApplication.run(TodoApplication.class, args);
	}

}
