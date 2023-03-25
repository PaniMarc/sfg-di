package com.example.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.sfgdi.services.ContructorGreetingService;

class ConstructorInjectedcontrollerTest {

	ConstructorInjectedcontroller controller;
	@BeforeEach
	void setUp() throws Exception {
		controller= new ConstructorInjectedcontroller(new ContructorGreetingService());
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
