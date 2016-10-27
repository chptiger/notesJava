package com.usernotes.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HelloHandler {
	
	public HelloHandler(){
		System.out.println("HelloHandler constructor ********************************************************************************************************");
	}
	
	@ResponseBody
	@RequestMapping(value="/helloworld", method=RequestMethod.GET)
	public String hello(){
		System.out.println("hello world.");
		return "success";
	}
}
