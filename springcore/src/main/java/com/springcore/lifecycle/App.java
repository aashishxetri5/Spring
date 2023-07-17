package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleConfig.xml");
		
//		Car supra = (Car) ac.getBean("Supra");		
		
//		System.out.println(supra);
//		ac.registerShutdownHook(); //Calling the destroy function.
		
//		System.out.println("-----------------------------------------");
		
//		Drinks coke = (Drinks) ac.getBean("Coke");
//		System.out.println(coke);
		
//		System.out.println("-----------------------------------------");
		
		Person me = (Person) ac.getBean("Aashish");
		System.out.println(me);
		
		ac.close(); //Releasing resources.

	}

}
