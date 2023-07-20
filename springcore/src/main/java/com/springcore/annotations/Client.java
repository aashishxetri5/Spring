package com.springcore.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		//Because we are using annotations
		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(JavaConfig.class);
		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(Student.class);
		
		Student student1 = context2.getBean("student", Student.class);
		
		student1.task();
		
		Teacher teacher1 = context1.getBean("getTeacher", Teacher.class);
		
		teacher1.getSubject().printName();
		
		System.out.println(teacher1);
		
		context1.close();
		context2.close();

	}

}
