package com.springcore.annotations;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = "com.springcore.annotations")
@Component("student")
public class Student {
	
	public Student() {
		super();
	}
	
	public void task() {
		System.out.println("Student is studying");
	}
}
