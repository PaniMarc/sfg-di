package com.example.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.sfgdi.services.GreetingsService;

@Controller
public class PropertyInjectedController {

	@Autowired
	@Qualifier("propertyGreetingService")
	public GreetingsService greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
