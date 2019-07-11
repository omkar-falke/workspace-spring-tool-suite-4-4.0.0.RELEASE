package com.cjc.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Employee;

@RestController
public class HomeController {

	@RequestMapping("/data")
	
	public List<Employee> getData()
	{
		Employee e=new Employee();
		List<Employee>list=new ArrayList<Employee>();
		e.setId(101);
		e.setName("omkar");
		e.setAddress("Pune");
		
		Employee e1=new Employee();
		e1.setId(102);
		e1.setName("ok");
		e1.setAddress("mumbai");
		list.add(e);
		list.add(e1);
		return list;
		
	}
	
}
