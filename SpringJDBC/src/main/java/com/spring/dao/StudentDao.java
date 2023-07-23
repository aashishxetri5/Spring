package com.spring.dao;

import com.spring.entities.Student;

public interface StudentDao {

	public int insert(Student student);

	public int update(Student student);
	
	public int delete(int id);
	
	public void viewRecords();
}
