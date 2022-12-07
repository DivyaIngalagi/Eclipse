package com.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.dao.AadminDao;
import com.dao.AadminDaoImpl;
import com.dao.AdminRowMapperImpl;
import com.dao.RowMapperImpl;
import com.dao.StudentRowMapperImpl;
import com.model.Admin;
import com.model.Questions;
import com.model.Student;

public class Menus {
	
	private JdbcTemplate jdbcTemplate;

	public void selectMenu() {
		Scanner scan=new Scanner(System.in);
		int choice=0;
	do {
	System.out.println("---MENU---");
	System.out.println("1.Admin\n2.Student\n0.Exit");
	System.out.println("------------------");
	System.out.println("Enter your choice");
	choice=scan.nextInt();
	scan.nextLine();
	switch(choice) {
	case 1:
		
		System.out.println("Enter UserName");
		String auname=scan.nextLine();
		System.out.println("Enter Password");
		String apwd=scan.nextLine();
		String query ="select * from admin_details where a_username=?";
		RowMapper<Admin> rowMapper= new AdminRowMapperImpl();
		Admin admin = this.jdbcTemplate.queryForObject(query,rowMapper,auname);
	
		if(admin.getUsername().equals(auname) && admin.getPassword().equals(apwd)) {
		System.out.println("WELCOME TO ADMIN PANEL");
		System.out.println("================================================");
		AdminCRUDService aobj = new AdminCRUDService();
		}else {
			System.out.println("Invalid Credentials");
		}
		
		break;
		
	case 2:
		System.out.println("Enter UserName");
		String suname=scan.next();
		System.out.println("Enter Password");
		String spwd=scan.next();
		String squery ="select * from student where s_username=?";
		RowMapper<Student> srowMapper= new StudentRowMapperImpl();
		Student std = this.jdbcTemplate.queryForObject(squery,srowMapper,suname);
	
		if(std.getUsername().equals(suname) && std.getPassword().equals(spwd)) {
			System.out.println("WELCOME TO EXAM PANEL");
			System.out.println("================================================");
			StudentCRUDService sobj=new StudentCRUDService();
		}else {
			System.out.println("Invalid Credentials");
		}
		
		break;
		
	
	}
	}while(choice!=0);
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
}
