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
		
//		std.setId(211825);
//		std.setName("Nayan Banskota");
//		std.setAddress("Samakhusi");
//		std.setGrade(15);
		
//		std.setName("Ekanta Rai");
//		std.setAddress("Ekantakuna");
		
//		int result = dao.insert(std);
		
//		int result = dao.update(std);
		
//		int result = dao.delete(std.getId());
		
//		dao.viewRecords();
		std = dao.getStudent(211843);
		
		System.out.println(std);
				
//		System.out.println("Number of records affected: " + result);

		context.close();
	}

}
