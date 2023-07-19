package com.springcore.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("studentObj")
@Scope("prototype")
public class Student {

	@Value("Aashish Katwal")
	private String name;
	@Value("Boudha")
	private String address;
	@Value("211812")
	private int rollNumber;
	
	@Value("#{phNums}")
	private List<String> phoneNums;
	
	
	public Student() {
		super();
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

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public List<String> getPhoneNums() {
		return phoneNums;
	}

	public void setPhoneNums(List<String> phoneNums) {
		this.phoneNums = phoneNums;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", rollNumber=" + rollNumber + "]";
	}

}
