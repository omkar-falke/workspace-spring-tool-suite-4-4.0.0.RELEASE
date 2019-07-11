package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan
public class RegistrationWebServicesDemoApplication {

	public static void main(String[] args) {
		System.out.println("Hiiii");
		SpringApplication.run(RegistrationWebServicesDemoApplication.class, args);
	}
}
