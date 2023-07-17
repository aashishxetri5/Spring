package com.springcore.CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/CI/CiConfig.xml");
		
		Person person1 = (Person) context.getBean("person1");
		Person person2 = (Person) context.getBean("person2");
		Person person3 = (Person) context.getBean("personList");
		
		System.out.println(person1.toString());
		System.out.println("---------------------------------");
		System.out.println(person2.toString());
		System.out.println("---------------------------------");
		System.out.println(person3.getPhones());
		
		((ConfigurableApplicationContext) context).close();

	}

}
