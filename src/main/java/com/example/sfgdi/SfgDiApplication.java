package com.example.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.sfgdi.controllers.ConstructorInjectedcontroller;
import com.example.sfgdi.controllers.MyController;
import com.example.sfgdi.controllers.PropertyInjectedController;
import com.example.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		//when Spring creates a bean by default his name is the name of the class, with lowercase first letter
		MyController myController= (MyController) ctx.getBean("myController");
		
		String greeting= myController.sayHello();
		
		System.out.println(greeting);
		
		System.out.println("---property");
		
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("--- setter");
		
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("--- constructor");
		
		ConstructorInjectedcontroller constructorInjectedcontroller = (ConstructorInjectedcontroller) ctx.getBean("constructorInjectedcontroller");
		
		System.out.println(constructorInjectedcontroller.getGreeting());
		
	}

}
