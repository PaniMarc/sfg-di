package com.example.sfgdi.services;

import com.example.sfgdi.repository.EnglishGreetingRepository;

//@Profile("EN")
//@Service("I18nService")
public class I18nEnglishGreetingService implements GreetingsService {

	private final EnglishGreetingRepository englishGreetingRepository;
	
	public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
		this.englishGreetingRepository=englishGreetingRepository;
	}
	
	@Override
	public String sayGreeting() {
		return englishGreetingRepository.getGreeting();
	}

}
