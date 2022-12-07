package com.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.dao.AadminDao;
import com.dao.AadminDaoImpl;

public class MainClass {

	public static void main(String[] args) {
		

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		AadminDao adminDao = context.getBean("adminDao",AadminDaoImpl.class);
//		Menus menu=new Menus();
//		menu.selectMenu();
		
		Menus menu=context.getBean("allMenu",Menus.class);
		menu.selectMenu();
	}

	

}
