package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EntityScan(basePackages="com")
@SpringBootApplication(scanBasePackages="com")
public class WebServiceExampleApplication {
	public static void main(String[] args) {
		
		System.out.println("Hello omkar");
		SpringApplication.run(WebServiceExampleApplication.class, args);
	}

}
