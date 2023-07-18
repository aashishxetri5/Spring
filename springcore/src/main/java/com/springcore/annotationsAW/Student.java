package com.springcore.annotationsAW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private int roll;
	private String majorCourse;
	
	@Autowired
	@Qualifier("person2")
	private Person person;

	public Student() {
		super();
	}

	public Student(int roll, String majorCourse, Person person) {
		super();
		this.roll = roll;
		this.majorCourse = majorCourse;
		this.person = person;
	}

//	@Autowired
	public Student(Person person) {
		super();
		this.person = person;
		System.out.println("Inside Constructor 1");
	}
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getMajorCourse() {
		return majorCourse;
	}

	public void setMajorCourse(String majorCourse) {
		this.majorCourse = majorCourse;
	}

	public Person getPerson() {
		return person;
	}

//	@Autowired
	public void setPerson(Person person) {
		System.out.println("Inside Setter");
		this.person = person;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", majorCourse=" + majorCourse + ", person=" + person + "]";
	}

}
