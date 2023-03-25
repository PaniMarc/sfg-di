package com.example.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.sfgdi.services.GreetingsService;

@Controller
public class ConstructorInjectedcontroller {

	//dependency made using constructor we don't need to autowired cause it's "deafult" by spring
	private final GreetingsService greetingsService;
	
	public ConstructorInjectedcontroller(@Qualifier("contructorGreetingService") GreetingsService greetingsService) {
		this.greetingsService= greetingsService;
	}
	
	public String getGreeting() {
		
		return greetingsService.sayGreeting();
	}
}
