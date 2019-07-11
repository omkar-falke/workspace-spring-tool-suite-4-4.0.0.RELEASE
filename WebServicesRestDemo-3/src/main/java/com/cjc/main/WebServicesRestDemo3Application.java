package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com")
public class WebServicesRestDemo3Application {

	public static void main(String[] args) {
		System.out.println(" Data Is running...");
		SpringApplication.run(WebServicesRestDemo3Application.class, args);
	}

}
