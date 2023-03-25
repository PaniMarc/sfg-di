package com.example.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.sfgdi.services.GreetingsService;

@Controller
public class SetterInjectedController {
	
	private GreetingsService greetingService;
	
	@Autowired
	public void setGreetingService(@Qualifier("setterGreetingService") GreetingsService greetingsService) {
		this.greetingService= greetingsService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
