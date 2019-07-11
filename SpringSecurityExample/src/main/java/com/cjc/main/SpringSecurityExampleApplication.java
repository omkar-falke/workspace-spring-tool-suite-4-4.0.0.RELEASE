package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityExampleApplication {

	public static void main(String[] args) {
		System.out.println("Spring Security app running ..............");
		SpringApplication.run(SpringSecurityExampleApplication.class, args);
	}

}
