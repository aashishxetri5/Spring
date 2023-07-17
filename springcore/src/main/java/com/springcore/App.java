package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!");

//		Spring IOC in action
		System.out.println("Printing the object where values are set using setters: ");
		ApplicationContext ac = new ClassPathXmlApplicationContext("./config.xml"); //multiple files can also be passed as (new String[] {"multiple.xml", "file.xml", "names.xml"}
		Student student1 = (Student) ac.getBean("student1");
		System.out.println(student1);
		System.out.println("----------------------------------------");

//     	Setting the values through constructor
		System.out.println("Printing the object where values are set using constructor: ");
		Student std2 = (Student) ac.getBean("student2");
		System.out.println(std2);
		System.out.println("----------------------------------------");

//     	Injecting Objects
		System.out.println("Injecting Objects: ");

		Student stds = (Student) ac.getBean("students");
		System.out.println(stds);
		System.out.println(stds.getSubj1().getSubject1() + "\t" + stds.getSubj1().getSubject2());
		System.out.println(stds.getSubj2().getSubject1() + "\t" + stds.getSubj2().getSubject2());
		System.out.println("----------------------------------------");
		
		
//		Injecting objects using p schema
		
//		Student std3 = (Student) ac.getBean("student3");
//		System.out.println(std3);

		((ConfigurableApplicationContext) ac).close();
	}
}
