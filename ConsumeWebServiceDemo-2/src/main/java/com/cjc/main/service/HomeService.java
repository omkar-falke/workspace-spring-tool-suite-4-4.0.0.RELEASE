package com.cjc.main.service;

import java.util.List;

import com.cjc.main.model.Student;

public interface HomeService {
	
	public void registerData(Student s);
	public List<Student>getData();

}
