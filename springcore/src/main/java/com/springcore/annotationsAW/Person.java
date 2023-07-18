/**
 * 
 */
package com.springcore.annotationsAW;

/**
 * @author asus
 *
 */
public class Person {

	private String name, age;
	
	public Person() {
		super();
	}
	
	public Person(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}