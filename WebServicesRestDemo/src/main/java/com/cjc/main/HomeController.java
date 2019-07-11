package com.cjc.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(path = "/hello")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping(path = "/hello-beans")
	public HelloWorldBeans helloWorldBenas() {
		return new HelloWorldBeans("Hi This For Test Purpose.");
	}

	@GetMapping(path="hello-beans/path-variable/{name}")
	public HelloWorldBeans HelloWorldPath(@PathVariable String name)
	{
		return new HelloWorldBeans(String.format("Hello %s",name));
	}
	
}
