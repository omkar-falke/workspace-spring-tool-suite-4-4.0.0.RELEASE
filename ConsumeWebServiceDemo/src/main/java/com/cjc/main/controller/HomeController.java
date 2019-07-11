package com.cjc.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;

@RestController
public class HomeController {
	@RequestMapping("/getData")
	public List<Student> getData() {
		Student s = new Student();
		s.setRollno(25);
		s.setName("Omkar");
		s.setAddress("Pune");
		List<Student> list = new ArrayList<Student>();
		list.add(s);
		return list;
	}
}
