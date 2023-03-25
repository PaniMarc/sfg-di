package com.example.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingsService{

	@Override
	public String sayGreeting() {
		return "Hello World - From Primary Bean";
	}

}
