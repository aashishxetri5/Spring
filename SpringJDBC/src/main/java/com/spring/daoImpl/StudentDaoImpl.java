package com.spring.daoImpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.dao.StudentDao;
import com.spring.entities.Student;

@Component("sdi")
public class StudentDaoImpl implements StudentDao {
	
	@Value("#{jdbcTemplate}")
	private JdbcTemplate template;

	public int insert(Student student) {
		String query = "INSERT INTO Student values (?, ?, ?, ?)";
		int noOfInsertion = this.template.update(query, student.getId(), student.getName(), student.getAddress(), student.getGrade());
		
		return noOfInsertion;
	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	
	
}
