package com.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.dao.StudentDao;
import com.spring.daoImpl.StudentDaoImpl;
import com.spring.entities.Student;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		StudentDao dao = context.getBean("sdi", StudentDaoImpl.class);
		
		Student std = new Student();
		
		std.setId(211825);
		std.setName("Nayan Banskota");
		std.setAddress("Samakhusi");
		std.setGrade(15);
		
		int result = dao.insert(std);
				
		System.out.println("Number of records inserted: " + result);

		context.close();
	}

}
