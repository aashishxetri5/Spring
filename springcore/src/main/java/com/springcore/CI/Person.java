package com.springcore.CI;

import java.util.List;

public class Person {

	private int id;
	private String fullname;
	private String address;
	private Certificate certif;
	
	private List<String> phones;
	
	public Person() {
		super();
	}

	public Person(int id, String fullname, String address, Certificate certif) {
		this.id = id;
		this.fullname = fullname;
		this.address = address;
		this.certif = certif;
	}
	
	public Person(int id, String fullname, List<String> phones) {
		this.id = id;
		this.fullname = fullname;
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", fullname=" + fullname + ", address=" + address + ", certif=" + this.certif + "]";
	}
	
	public List<String> getPhones() {
		return phones;
	}
	
	
}
