package com.springcore.lifecycle;

public class Car {

	private int speed;
	
	public Car() {
		super();
	}

	public void setSpeed(int speed) {
		System.out.println("Setting property");
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	@Override
	public String toString() {
		return "Speed = " + speed;
	}
	
	
	public void init() {
		
		System.out.println("Inside init");
	}
	
	public void destroy() {
		System.out.println("Inside destroy");
	}
	
}
