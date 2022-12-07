package com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.dao.AadminDao;
import com.dao.AadminDaoImpl;
import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.service.MainClass;


@Configuration
public class ConfigurationClass {

	@Bean(name = { "ds" })
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		ds.setUrl("jdbc:sqlserver://localhost;databaseName=preImpact;instanceName=SQLEXPRESS2019");
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
//	@Bean(name= {"adminDao"})
//	public AadminDao getAadminDao() {
//		AadminDaoImpl adminDao = new AadminDaoImpl();
//		adminDao.setJdbcTemplate(getTemplate());
//		return adminDao;
//		
//	}
	
	
//	@Bean(name= {"studentDao"})
//	public StudentDao getStudentDao() {
//		StudentDaoImpl studentDao = new StudentDaoImpl();
//		studentDao.setJdbcTemplate(getTemplate());
//		return  (StudentDao) studentDao;
//		
//	}
	
//	@Bean(name= {"adminDao"})
//	public MainClass getMainDao() {
//		MainClass mainDao = new MainClass();
//		mainDao.setJdbcTemplate(getTemplate());
//		return mainDao;
//		
//	}
}
