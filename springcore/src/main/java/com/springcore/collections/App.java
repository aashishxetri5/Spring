package com.springcore.collections;

import java.util.Iterator;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/collections/config2.xml");
		
		Employees emp1 = (Employees) ac.getBean("employee1");
		
		System.out.println(emp1.getEmployeeName());
		
		System.out.println("--------------------------------------");
		
		Iterator<String> phones = emp1.getPhones().iterator();		
		while(phones.hasNext()) {			
			System.out.println(phones.next());
		}
		
		System.out.println("--------------------------------------");
		Iterator<String> address = emp1.getAddresses().iterator();
		while(address.hasNext()) {
			System.out.println(address.next());
		}
		
		System.out.println("--------------------------------------");
		Iterator<Map.Entry<String, String>> course = emp1.getCourses().entrySet().iterator();
		
		while(course.hasNext()) {
			System.out.println(course.next());
//			System.out.println(course.next().getValue());
		}
		
//		System.out.println(emp1.getCourses());
		
		System.out.println("--------------------------------------");
		
		Iterator<String> props = emp1.getProperties().stringPropertyNames().iterator();
				
		while(props.hasNext()) {
			System.out.println(emp1.getProperties().getProperty(props.next()));
		}
		
		System.out.println(emp1.getProperties());
		
		
		((ConfigurableApplicationContext) ac).close();

	}

}
