package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumeWebServiceDemo3Application {

	public static void main(String[] args) {
		System.out.println("Demo 3 Running.......");
		SpringApplication.run(ConsumeWebServiceDemo3Application.class, args);
	}
	@Bean
	public RestTemplate restTemplate()
	{
		RestTemplate rt=new RestTemplate();
		
		return  rt;
	}

}
