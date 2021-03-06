package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.Student;
import com.cjc.main.service.HomeServiceI;

@Controller

public class HomeController {

	@Autowired
	HomeServiceI si;

	@RequestMapping("/")
	public String CheckLogin() {

		return "Login";
	}

	@RequestMapping("/register")
	public String checkRegister() {
		return "register";

	}

	@RequestMapping("/reg")
	public String addRegister(@ModelAttribute Student st) {
		si.registerData(st);
		return "Login";
	}
	@RequestMapping("/success")
	public String checkSuccess() {
		return "success";
	}
	@RequestMapping("/login")
	public String showData(Model m, @RequestParam("username") String username,
			@RequestParam("password") String password) {
		List<Student> list = si.getData();
		if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
			m.addAttribute("msg", list);
			return "success";
		} else {
			List<Student>li=si.checkLogin(username, password);
			if(li!=null)
			{
				m.addAttribute("msg", li);
				return "success";
			}
			else
			{
				return "Login";
			}
		}
	}
	
	
	@RequestMapping("/del")
	public String deleteData(@RequestParam("rid")int id,Model m)
	{
		si.deleteData(id);
		List<Student> list = si.getData();
		m.addAttribute("msg", list);
		return "success";
	}
	
	@RequestMapping("/upd")
	public String editData(@RequestParam("rid")int id,Model m)
	{
		Student s=si.EditData(id);
		m.addAttribute("msg", s);
		return "Edit";
	}
	
	@RequestMapping("/Edit")
	public String EditPage()
	{
		return "Edit";
	}
	
	@RequestMapping("/update")
	public String updateData(@ModelAttribute Student s,Model m)
	{
		si.registerData(s);
		List<Student> list = si.getData();
		m.addAttribute("msg", list);
		return "success";	
	}
}
