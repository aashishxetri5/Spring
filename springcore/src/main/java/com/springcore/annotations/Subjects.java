package com.springcore.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Subjects {
	@Value("AI")
	private String name;
	
	public Subjects() {
		super();
	}

	public void printName() {
		System.out.println("Subject name is: " + name);
	}
	
}
