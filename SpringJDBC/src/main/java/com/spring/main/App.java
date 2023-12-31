package com.spring.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.dao.StudentDao;
import com.spring.daoImpl.StudentDaoImpl;
import com.spring.entities.Student;

public class App {

	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao dao = context.getBean("getSDI", StudentDaoImpl.class);
		
		
//		Student std = new Student();
		
//		std.setId(211825);
//		std.setName("Nayan Banskota");
//		std.setAddress("Samakhusi");
//		std.setGrade(15);
		
//		std.setName("Ekanta Rai");
//		std.setAddress("Ekantakuna");
		
//		int result = dao.insert(std);
//		int result = dao.update(std);
//		int result = dao.delete(std.getId());
		
//		std = dao.getStudent(211843);
		
		List<Student> students = dao.viewRecords();
		for(Student student: students) {
			System.out.println(student);			
		}
				
//		System.out.println("Number of records affected: " + result);

		context.close();
	}

}
