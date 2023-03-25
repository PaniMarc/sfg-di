package com.example.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("I18nService")
public class I18nEnglishGreetingService implements GreetingsService {

	@Override
	public String sayGreeting() {
		return " Hello ";
	}

}
