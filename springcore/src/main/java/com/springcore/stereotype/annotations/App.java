package com.springcore.stereotype.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/annotations/config.xml");

		Student std = context.getBean("studentObj", Student.class);

		System.out.println(std);
		
		System.out.println(std.getPhoneNums());
		
		context.close();

	}

}
