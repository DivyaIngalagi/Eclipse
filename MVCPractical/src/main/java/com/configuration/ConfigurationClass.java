package com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.dao.AadminDao;
import com.dao.AadminDaoImpl;
import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.service.MainClass;
import com.service.Menus;


//@Configuration
public class ConfigurationClass {

	@Bean(name = { "ds" })
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		ds.setUrl("jdbc:sqlserver://localhost;databaseName=divya;instanceName=SQLEXPRESS");
		ds.setUsername("sa");
		ds.setPassword("password_123");
		return ds;
	}

	@Bean(name = { "jdbctemp" })
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
		

	}
	
	@Bean(name= {"internalview"})
	public InternalResourceViewResolver getView() {
		InternalResourceViewResolver view=new InternalResourceViewResolver();
		view.setPrefix("/WEB-INF/view/");
		view.setSuffix(".jsp");
		return view; 
	}
	
	
	@Bean(name= {"adminDao"})
	public AadminDao getAadminDao() {
		AadminDaoImpl adminDao = new AadminDaoImpl();
		adminDao.setJdbcTemplate(getTemplate());
		return adminDao;
		
	}
	
	
	@Bean(name= {"studentDao"})
	public StudentDao getStudentDao() {
		StudentDaoImpl studentDao = new StudentDaoImpl();
		studentDao.setJdbcTemplate(getTemplate());
		return  studentDao;
		
	}
	
	@Bean(name= {"allMenu"})
	public Menus getMenuDao() {
		Menus mainDao = new Menus();
		mainDao.setJdbcTemplate(getTemplate());
		return mainDao;
		
	}
}
