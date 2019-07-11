package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;





@RestController
@CrossOrigin("*")
public class HomeController {
	
	@Autowired 
	RestTemplate restTemplate;
	//port:9043
	@RequestMapping("/getData")
	public List getData()
	{
		String url="http://localhost:8080/getData";
		List ls=restTemplate.getForObject(url,List.class);
		System.out.println("--------------------------------------"+ls);
		return ls;
//		return ResponseEntity<Object>(ls, HttpStatus.OK);
		/*return new ResponseEntity(ls, HttpStatus.OK);*/
	}
	
	/*@RequestMapping("/setData")
	public String setData()
	{
		String url="http://localhost:8080/registerData";
		return "Register Data";
	}*/

}
