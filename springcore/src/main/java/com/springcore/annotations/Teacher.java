package com.springcore.annotations;


/**
 * No need to mention the @Component because @Bean tag is used in the JavaConfig class.
 * 
 *
 */

public class Teacher {
	
	private Subjects subject;
	
	public Teacher() {
		super();
	}

	public Teacher(Subjects subject) {
		this.subject = subject;
	}

	public Subjects getSubject() {
		return subject;
	}
	
	
}
