package com.springcore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("#{new java.lang.String('Aashish')}")
	private String name;
	@Value("#{new java.lang.Integer(211812)}")
	private String rollNumber;

	/*
	 * @Value("#{new java.lang.Boolean(true)}")
	 * 
	 * Or any expression that gives true like:
	 * 
	 * @Value("#{'a' == 'a'}")
	 * 
	 */
	@Value("#{true}")
	private boolean isFeeCleared;

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", Fee Cleared=" + isFeeCleared + "]";
	}

}
