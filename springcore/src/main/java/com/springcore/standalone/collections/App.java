package com.springcore.standalone.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standaloneConfig.xml");
		
		Person person = context.getBean("person1", Person.class);
		
		System.out.println(person);
		System.out.println(person.getFriends().getClass().getName());
		System.out.println(person.getFeeStr().getClass().getName());
		System.out.println(person.getDbProperties().getClass().getName());
		
		context.close();

	}

}
