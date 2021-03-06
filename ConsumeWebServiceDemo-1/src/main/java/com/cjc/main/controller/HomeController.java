package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
	
	@Autowired 
	RestTemplate restTemplate;
	
	@RequestMapping("/getData")
	public List getData()
	{
		String url="http://localhost:9020/getData";
		List ls=restTemplate.getForObject(url,List.class);
		return ls;
	}

}
