package com.springcore.annotations;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * No need to mention the @Component because @Bean tag is used in the JavaConfig class.
 * 
 *
 */

public class Teacher {
	private String name;
	private Subjects subject;
	
	public Teacher() {
		super();
	}

	public Teacher(String name, Subjects subject) {
		this.name = name;
		this.subject = subject;
	}
	
	@Autowired
	public Teacher(Subjects subject) {
		this.subject = subject;
	}

	public Subjects getSubject() {
		return subject;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + "]";
	}
	
}
