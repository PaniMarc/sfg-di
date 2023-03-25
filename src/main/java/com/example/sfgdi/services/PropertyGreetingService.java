package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingsService{

	@Override
	public String sayGreeting() {
		return "Hello World - Property";
	}

}
