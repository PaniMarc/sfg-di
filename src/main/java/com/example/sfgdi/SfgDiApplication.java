//By default springboot will search for Stereotype in this package and in all his sons.
package com.example.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.sfgdi.controllers.ConstructorInjectedcontroller;
import com.example.sfgdi.controllers.I18nController;
import com.example.sfgdi.controllers.MyController;
import com.example.sfgdi.controllers.PetController;
import com.example.sfgdi.controllers.PropertyInjectedController;
import com.example.sfgdi.controllers.SetterInjectedController;

//override the default component scan. We ask to look for components in com.example.sfgi ( default ) and com.example.pets
//without this, spring will look for component only in sfgdi
//@ComponentScan(basePackages = {"com.example.sfgdi","com.example.pets"})
//NOTE: after some refactor we get rid of Stereotypes in com.example.pets so we can erase the @ComponentScan

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());
		
		
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
