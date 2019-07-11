package com.cjc.main.service;

import java.util.List;

import com.cjc.main.model.Student;

public interface HomeServiceI {

	public int registerData(Student s);

	public List<Student> getData();

	public void deleteData(int id);

	public Student EditData(int id);

	public Student UpdateData(Student s);
	
	public List<Student>checkLogin(String username,String password);

}
