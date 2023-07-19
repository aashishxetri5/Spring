package com.springcore.stereotype.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/annotations/config.xml");

		Student std = context.getBean("studentObj", Student.class);

		System.out.println(std);
		System.out.println(std.getPhoneNums());

		System.out.println("\n-------------Using Bean Scope----------------\n");
		
		System.out.println("First Object Hashcode: " + std.hashCode());
		
		System.out.println("-------------------------------------------");
		
		Student anotherStd = context.getBean("studentObj", Student.class);
		System.out.println("Second Object Hashcode: " + anotherStd.hashCode());
		
		Teacher teacher1 = context.getBean("teacher1", Teacher.class);
		Teacher teacher2 = context.getBean("teacher1", Teacher.class);
		Teacher teacher3 = context.getBean("teacher1", Teacher.class);
		
		System.out.println("\n-------------Teacher Class----------------");
		System.out.println("First Object Hashcode: " + teacher1.hashCode());
		System.out.println("Second Object Hashcode: " + teacher2.hashCode());
		System.out.println("Third Object Hashcode: " + teacher3.hashCode());
		 
		context.close();

	}

}
