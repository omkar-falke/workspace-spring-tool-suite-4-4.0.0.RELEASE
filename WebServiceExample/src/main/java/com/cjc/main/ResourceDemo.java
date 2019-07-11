package com.cjc.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceDemo {

	@Autowired
	ResourceRepo ro;
	@RequestMapping("/welcome")
	public List<Employee> getData() {
		List<Employee> list = (List<Employee>) ro.findAll();
		return list;
	}
	@RequestMapping("/hello")
	public Optional<Employee> getSingleData(@RequestParam("id")int id,@ModelAttribute Employee e)
	{
//		int id1=e.getId();
		//System.out.println("--------------------------------"+id1);
		return ro.findById(id);
	}
	
	@RequestMapping("/del")
	public void getDeleteData(@RequestParam("id")int id1,@ModelAttribute Employee e)
	{
		ro.deleteById(id1);	
	}

}

