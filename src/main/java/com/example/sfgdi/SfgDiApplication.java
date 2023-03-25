package com.example.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.sfgdi.controllers.ConstructorInjectedcontroller;
import com.example.sfgdi.controllers.I18nController;
import com.example.sfgdi.controllers.MyController;
import com.example.sfgdi.controllers.PropertyInjectedController;
import com.example.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		
		System.out.println("--- I18nBean");
		System.out.println( i18nController.sayHello());
		//when Spring creates a bean by default his name is the name of the class, with lowercase first letter
		MyController myController= (MyController) ctx.getBean("myController");
		
		System.out.println("--- Primary Bean");
		System.out.println(myController.sayHello());
		
		
		System.out.println("--- Property");
		
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("--- Setter");
		
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("--- Constructor");
		
		ConstructorInjectedcontroller constructorInjectedcontroller = (ConstructorInjectedcontroller) ctx.getBean("constructorInjectedcontroller");
		
		System.out.println(constructorInjectedcontroller.getGreeting());
		
		
		
	}

}
