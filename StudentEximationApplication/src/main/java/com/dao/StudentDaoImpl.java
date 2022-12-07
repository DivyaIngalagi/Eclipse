package com.dao;

import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import com.model.Questions;

public class StudentDaoImpl implements StudentDao {

private JdbcTemplate jdbcTemplate;
	
	
	Scanner input = new Scanner(System.in);

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	int count=0;
	public void GiveExam() {
		String query ="select * from question";
		List<Questions> qstd = this.jdbcTemplate.query(query, new RowMapperImpl());
		for(Questions allstdq:qstd) {
			
			System.out.println(allstdq.getQues()+"\n"+allstdq.getA()+"\n"+allstdq.getB()+"\n"+allstdq.getC()+"\n"+allstdq.getD());
			String correct=allstdq.getCorrect();
			System.out.println("Enter the correct Option");
			String a=input.next();
			if(a.equals(correct)) {
				count++;
			}
		}
		
		if(count==0||count<=5) {
			 System.out.println("Exam Finished");
			 System.out.println("Your Score is:"+count+"out of 10");
			 System.out.println("You Are Failed Kindly try again");
			 System.out.println("THank YOU!!!");
		 }else {
			 System.out.println("Exam Finished");
			 System.out.println("Your Score is:"+count+"out of 10");
			 System.out.println("Successfully Passed Exam");
			 System.out.println("THank YOU!!!");
		 }
		System.exit(0);
	}
	

	
	
}
