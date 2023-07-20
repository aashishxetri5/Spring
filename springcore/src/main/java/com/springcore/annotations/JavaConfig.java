package com.springcore.annotations;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.annotations") // Can include multiple packages
//This is commented because @Bean annotation is used. 
public class JavaConfig {

	@Bean(name = {"subject", "bisaya"})
	public Subjects getSubjects() {
		Subjects subject = new Subjects();
		
		return subject;
	}

	@Bean
	public Teacher getTeacher() { //The method name is the name of the bean

		Teacher teacher = new Teacher(getSubjects());
		return teacher;
	}
	
}
