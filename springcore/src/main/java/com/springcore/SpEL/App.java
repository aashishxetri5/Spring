package com.springcore.SpEL;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/SpEL/config.xml");
		
		Calculator calculate = context.getBean("calculator", Calculator.class);
		
		System.out.println(calculate);
		System.out.println("Sum: " + calculate.sum());
		
		SpelExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("88-8+20");
		System.out.println(expression.getValue() );
		
		
		Student std = context.getBean("student", Student.class);
		
		System.out.println("\n\n" + std);
		
		context.close();

	}

}
