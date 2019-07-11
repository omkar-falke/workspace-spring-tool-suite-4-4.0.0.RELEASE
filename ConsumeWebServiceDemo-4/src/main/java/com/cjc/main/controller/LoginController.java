package com.cjc.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin("*")
public class LoginController {	
	@RequestMapping("/login")
	public String checkLogin()
	{
		return "index";
	}
}
