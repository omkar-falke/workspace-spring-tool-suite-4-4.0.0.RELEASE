package com.cjc.main;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	

	
	@RequestMapping("/")
	public String m2()
	{
		return "hello";
		
	}
}
