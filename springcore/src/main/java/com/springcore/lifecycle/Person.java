package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person {
	private String name;
	
	public Person() {
		super();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return ("Name = " + name);
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting initialization tasks");
	}
	
	@PreDestroy
	public void stop() {
		System.out.println("Starting destroy tasks");
	}
	
}
