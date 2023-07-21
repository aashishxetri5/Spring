package com.spring.entities;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private int id;
	private String name;
	private String address;
	private int grade;

	public Student() {
		super();
	}

	public Student(int id, String name, String address, int grade) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}
