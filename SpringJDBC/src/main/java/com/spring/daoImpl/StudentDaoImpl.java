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
	
	public int update(Student student) {
		String query = "UPDATE Student set name=?, address=? where id=?";
		int noOfUpdation = this.template.update(query, student.getName(), student.getAddress(), student.getId());
		return noOfUpdation;
	}
	
	public int delete(int id) {
		String query = "DELETE FROM Student where id = ?";
		int noOfDeletion = this.template.update(query, id);
		return noOfDeletion;
	}
	
	public void viewRecords() {
		String query = "SELECT * FROM Student";
		this.template.execute(query);
	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	
	
}
