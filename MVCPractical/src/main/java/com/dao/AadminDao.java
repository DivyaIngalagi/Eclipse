package com.dao;

import java.util.List;

import com.model.Admin;
import com.model.Questions;
import com.model.Student;

public interface AadminDao {

	public int insertStudent(Student admin);
	
	public int updateStudent(Student admin);
	
	public int deleteStudent(Student admin);
	
	
	public Student getStudent(int id);
	

	public List<Student> getAllStudents();
	
	public int insertQuestion(Questions que);
	
	public int updateQuestion(Questions que);
	
	public int deleteQuestion(Questions que);
}
