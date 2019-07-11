package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.service.HomeService;

@RestController
@CrossOrigin("*")
public class HomeController {

	@Autowired
	HomeService hs;
	
	/*@PostMapping("/registerData")
	public String registerData(@RequestBody Student s)
	{
		hs.registerData(s);
		return "Register Data";
	}
	*/
	//Port:8080
	@GetMapping("/getData")
	public List<Student> getData()
	{
		List<Student>list=hs.getData();
		System.out.println(list);
		return list;
//		return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
	}
	
}
