package com.springcore.annotations;

//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Subjects {
//	@Value("AI")
	private String name;
	private String subjectId;

	public Subjects() {
		super();
	}

	public Subjects(String name, String subjectId) {
		super();
		this.name = name;
		this.subjectId = subjectId;
	}

	public void printName() {
		System.out.println("Subject name is: " + name);
	}

	@Override
	public String toString() {
		return "Subjects [name=" + name + ", subjectId=" + subjectId + "]";
	}

}
