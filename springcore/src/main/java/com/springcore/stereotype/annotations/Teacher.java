package com.springcore.stereotype.annotations;

public class Teacher {

	private String name;
	private String subject;
	
	private Teacher() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String toString() {
		return ("Name: " + name + " Subject: " + subject);
	}
	

}
