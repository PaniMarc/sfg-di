package com.example.sfgdi.controllers;

import org.springframework.stereotype.Component;

import com.example.sfgdi.services.GreetingsService;

@Component
public class MyController {
	
	private final GreetingsService greetingsService;
	
	public MyController(GreetingsService greetingsService) {
		this.greetingsService = greetingsService;
	}

	public String sayHello() {
		return greetingsService.sayGreeting();
	}
}
