package com.cjc.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.cjc.main.model.Student;
import com.cjc.main.repository.CrudRepo;

@Service
public class ServiceDemo{
	@Autowired
	CrudRepo cr;
	public List<Student>getData()
	{
		List<Student> list=(List<Student>) cr.findAll();
		return list;
	}
	
	public Student setData(@RequestBody Student stu)
	{
		return cr.save(stu);
	}
	
	public void updateData(@RequestBody Student s)
	{
		cr.save(s);
	}
	
	public void deleteData(@PathVariable(name="rollno")int rollno)
	{
		cr.deleteById(rollno);
	}
	
	public void checkLogin(@PathVariable(name="username")String username,@PathVariable("password")String password)
	{
		cr.findByUsernameAndPassword(username,password);
	}
	
	
	
	
	
	
	

}
