package com.example.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.sfgdi.services.ContructorGreetingService;
import com.example.sfgdi.services.PropertyGreetingService;
import com.example.sfgdi.services.SetterGreetingService;

//if we want to bring in some object in spring context, and we can't use Stereotypes we use a configuration class ( e.g jackson for mapping )
//another example ( linked to jackson ) is if we want to do custom configuration for example custom mappings


//in this example we have erased the @Service in ConstructorGreetingService, and created a bean, during the start up spring boot will bring this into the context.
//same with propertyGreetingService
@Configuration
public class GreetingServiceConfig {
	
	@Bean
	//important: by default spring will create bean that has the name of of THE METHOD that we are using
	// so if we here used contructorGreetingServiceBEAN , the bean would have been called in that way
	ContructorGreetingService contructorGreetingService() {
		return new ContructorGreetingService();
	}
	
	@Bean
	PropertyGreetingService propertyGreetingService() {
		return new PropertyGreetingService();
	}
	
	@Bean
	SetterGreetingService setterGreetingService() {
		return new SetterGreetingService();
	}
	

}
