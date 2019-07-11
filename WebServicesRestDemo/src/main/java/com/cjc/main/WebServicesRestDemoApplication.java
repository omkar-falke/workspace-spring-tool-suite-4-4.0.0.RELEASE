package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com")
public class WebServicesRestDemoApplication {

	public static void main(String[] args) {
		System.out.println("Rest Services Demo Running ....");
		SpringApplication.run(WebServicesRestDemoApplication.class, args);
	}

}
