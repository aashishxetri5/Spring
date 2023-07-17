package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Drinks implements InitializingBean, DisposableBean {
	private int price;
	private String name;

	public Drinks() {
		super();
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Drinks [price=" + price + ", name=" + name + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("Doing the function of init().");

	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("Doing the function of destroy().");
		
	}

}
