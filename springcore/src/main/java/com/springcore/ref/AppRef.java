package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRef {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		
		A aref = (A) context.getBean("aref");
		
		System.out.println(aref.getX());
		System.out.println(aref.getOb());
		System.out.println(aref);
		
		A aob = (A) context.getBean("obA");
		
		System.out.println(aob);
		
		((ConfigurableApplicationContext) context).close();
	}
}
