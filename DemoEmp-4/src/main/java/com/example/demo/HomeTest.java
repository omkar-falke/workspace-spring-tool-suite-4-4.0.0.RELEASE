package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeTest {
	/*@RequestMapping("/lo")
	public String m2(@RequestParam String name,ModelMap m)
	{
		m.put("name", name);
		return "hello";
		
	}*/
	
	@Autowired
	LoginService ls;
	
	@RequestMapping( value="/lo",method=RequestMethod.GET)
	public String m2()
	{
		return "hello";
		
	}
	
	@RequestMapping (value="/lo",method=RequestMethod.POST)
	public String m3(@RequestParam("username")String name,String password,ModelMap m)
	{
		boolean isValidUser =ls.validateUser(name, password);
		if(isValidUser)
		{
			m.put("name", name);
			return "welcome";
		}
		else
		{
			m.put("errorMessage", "Invalid Credentials!!");
			return "hello";
		}
		
	}

}
