package com.example.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.example.pets.PetService;
import com.example.pets.PetServiceFactory;
import com.example.sfgdi.repository.EnglishGreetingRepository;
import com.example.sfgdi.repository.EnglishGreetingRepositoryImpl;
import com.example.sfgdi.services.ConstructorGreetingService;
import com.example.sfgdi.services.I18nEnglishGreetingService;
import com.example.sfgdi.services.I18nItalianGreetingService;
import com.example.sfgdi.services.PrimaryGreetingService;
import com.example.sfgdi.services.PropertyGreetingService;
import com.example.sfgdi.services.SetterGreetingService;

//if we want to bring in some object in spring context, and we can't use Stereotypes we use a configuration class ( e.g jackson for mapping )
//another example ( linked to jackson ) is if we want to do custom configuration for example custom mappings


//in this example we have erased the @Service in ConstructorGreetingService, and created a bean, during the start up spring boot will bring this into the context.
//same with propertyGreetingService

//with importresource we import the bean that we have configured in xml
@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {
	
	//important: by default spring will create bean that has the name of of THE METHOD that we are using
	// so if we here used contructorGreetingServiceBEAN , the bean would have been called in that way
	@Bean
	ConstructorGreetingService contructorGreetingService() {
		return new ConstructorGreetingService();
	}
	
	@Bean
	PropertyGreetingService propertyGreetingService() {
		return new PropertyGreetingService();
	}
	
	@Bean
	SetterGreetingService setterGreetingService() {
		return new SetterGreetingService();
	}
	
	@Primary
	@Bean
	PrimaryGreetingService primaryGreetingService() {
		return new PrimaryGreetingService();
	}
	
	@Bean
	EnglishGreetingRepository englishGreetingRepository() {
		return new EnglishGreetingRepositoryImpl();
	}
	
	@Bean
	@Profile("EN")
	//since the name of the bean is the name of the method, we tanslate @Service("I18nService") 
	//simply changing the name of the metod
	I18nEnglishGreetingService I18nService(EnglishGreetingRepository englishGreetingRepository) {
		return new I18nEnglishGreetingService(englishGreetingRepository);
	}
	
	@Bean("I18nService")
	@Profile({"IT", "default"})
	//if we go back to the I18nItalianGreetingService declaration we annotated ad @Service("I18nService")
	//thanks to the profile this don't go in error. With the java configuration method we have a problem
	//since two method cannot have the name ( and input ) so we are forced to change the name of the method here.
	//But we can declare the name of the bean in @Bean annotation
	I18nItalianGreetingService i18nItaliaService() {
		return new I18nItalianGreetingService();
	}
	
	@Bean
	PetServiceFactory petServiceFactory() {
		return new PetServiceFactory();
	}
	
	@Bean
	@Profile({"dog","default"})
	PetService dogPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("dog");
	}
	
	@Bean
	@Profile({"cat"})
	PetService catPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("cat");
	}
}
