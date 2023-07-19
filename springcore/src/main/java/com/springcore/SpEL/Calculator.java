package com.springcore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

	@Value("#{22+78}")
	private int num1;

	@Value("#{111}")
	private int num2;

	@Value("#{T(java.lang.Math).sqrt(100)}")
	private double num3;

	@Value("#{T(java.lang.Math).E}")
	private double eulerNum;

	public Calculator() {
		super();
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public double getNum3() {
		return num3;
	}

	public void setNum3(double num3) {
		this.num3 = num3;
	}

	public double getEulerNum() {
		return eulerNum;
	}

	public void setEulerNum(double eulerNum) {
		this.eulerNum = eulerNum;
	}

	public int sum() {
		return (num1 + num2);
	}

	@Override
	public String toString() {
		return "Calculator [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", Eulers=" + eulerNum + "]";
	}

}
