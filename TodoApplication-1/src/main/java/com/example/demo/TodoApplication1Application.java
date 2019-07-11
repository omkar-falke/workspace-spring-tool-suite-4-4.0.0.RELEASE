package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com")
public class TodoApplication1Application {

	public static void main(String[] args) {
		System.out.println("Welcome in Todo Application...");
		SpringApplication.run(TodoApplication1Application.class, args);
	}

}
