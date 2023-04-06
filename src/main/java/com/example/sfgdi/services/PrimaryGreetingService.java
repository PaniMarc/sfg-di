package com.example.sfgdi.services;

//@Primary
//@Service
public class PrimaryGreetingService implements GreetingsService{

	@Override
	public String sayGreeting() {
		return "Hello World - From Primary Bean";
	}

}
