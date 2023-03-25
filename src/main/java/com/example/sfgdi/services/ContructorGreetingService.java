package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ContructorGreetingService implements GreetingsService{

	@Override
	public String sayGreeting() {
		return "Hello World - Constructor";
	}

}
