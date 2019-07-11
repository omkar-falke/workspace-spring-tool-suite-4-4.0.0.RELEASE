package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com")
public class DemoEmp4Application {

	public static void main(String[] args) {
		System.out.println("Hello Spring");
		SpringApplication.run(DemoEmp4Application.class, args);
	}

}
