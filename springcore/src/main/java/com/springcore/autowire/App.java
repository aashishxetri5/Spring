/**
 * 
 */
package com.springcore.autowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Aashish
 *
 */
public class App {

	public static void main(String[] args) {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/autowire/autowireConfig.xml");
		
		Student std1 = ac.getBean("Student1", Student.class); //Type casting not required.
		Student std2 = ac.getBean("Student2", Student.class); //Type casting not required.
		Student std3 = ac.getBean("Student3", Student.class); //Type casting not required.
		
		System.out.println(std1);
		System.out.println(std2);
		System.out.println(std3);
		
		ac.close();

	}

}
