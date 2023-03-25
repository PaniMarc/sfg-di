package com.example.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.sfgdi.services.ContructorGreetingService;

public class SetterInjectedControllerTest {
	
	SetterInjectedController controller;
	@BeforeEach
	void setUp() {
		controller= new SetterInjectedController();
		controller.setGreetingService(new ContructorGreetingService());
		
	}

	@Test
	void getGreeting(){
		System.out.println(controller.getGreeting());
	}
}
