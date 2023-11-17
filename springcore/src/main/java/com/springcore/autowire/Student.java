package com.springcore.autowire;

public class Student {

	private int roll;
	private String majorCourse;
	private Person person;

	public Student() {
		super();
	}

	public Student(int roll, String majorCourse, Person person1) {
		super();
		this.roll = roll;
		this.majorCourse = majorCourse;
		this.person = person1;
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

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", majorCourse=" + majorCourse + ", person=" + person + "]";
	}

}
