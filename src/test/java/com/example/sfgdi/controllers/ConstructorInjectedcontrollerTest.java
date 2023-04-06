package com.example.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.sfgdi.services.ConstructorGreetingService;

class ConstructorInjectedcontrollerTest {

	ConstructorInjectedcontroller controller;
	@BeforeEach
	void setUp() throws Exception {
		controller= new ConstructorInjectedcontroller(new ConstructorGreetingService());
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
