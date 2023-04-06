package com.example.sfgdi.services;


//@Profile("EN")
//@Service("I18nService")
public class I18nEnglishGreetingService implements GreetingsService {

	@Override
	public String sayGreeting() {
		return " Hello ";
	}

}
