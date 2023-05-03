package com.funnyproject.funapp.javaApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.funnyproject.funapp.javaApp.model.User;
 


@org.springframework.stereotype.Controller
public class Controller {
		
	@GetMapping
	public String index()
	{
		return "index"	;
	}
	
	@PostMapping("/login")
	public String userregistration(@ModelAttribute User user) {
		
			
		System.out.println(user.toString());
		return "welcome";
	}
}
