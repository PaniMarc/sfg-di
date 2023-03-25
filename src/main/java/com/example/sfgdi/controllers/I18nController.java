package com.example.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.sfgdi.services.GreetingsService;

//I18n stands for internationalization (starts with an i end with a n and is 18 characters long)
@Controller
public class I18nController {

	private final GreetingsService greetingsService;
	
	
	public I18nController(@Qualifier("I18nService") GreetingsService greetingsService) {
		this.greetingsService =greetingsService;
	}
	
	public String sayHello() {
		return greetingsService.sayGreeting();
	}
}
