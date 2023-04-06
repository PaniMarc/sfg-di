package com.example.sfgdi.services;


//if there is not active profile, the IT profile will be used
//@Profile({"IT", "default"})
//@Service("I18nService")
public class I18nItalianGreetingService implements GreetingsService {

	@Override
	public String sayGreeting() {
		return " Ciaooooo" ;
	}

}
