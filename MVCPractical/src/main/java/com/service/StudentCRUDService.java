package com.service;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.AadminDao;
import com.dao.AadminDaoImpl;
import com.dao.StudentDao;
import com.dao.StudentDaoImpl;

public class StudentCRUDService {
	
static Scanner input = new Scanner(System.in);
	
	@SuppressWarnings("resource")
	StudentCRUDService(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		 StudentDao stdDao = context.getBean("studentDao",StudentDaoImpl.class);
		
		 System.out.println("Start The Exam");
		 stdDao.GiveExam();		 
	}
	
	

}
