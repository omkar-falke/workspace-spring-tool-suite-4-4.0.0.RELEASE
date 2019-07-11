package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com")

public class DemoEmp3Application {

	public static void main(String[] args) {
		System.out.println("Omkar ................");
		SpringApplication.run(DemoEmp3Application.class, args);
	}

}
