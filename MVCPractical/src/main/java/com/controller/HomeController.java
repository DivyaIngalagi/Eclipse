package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;

import com.configuration.ConfigurationClass;
import com.dao.AadminDao;
import com.dao.AadminDaoImpl;
import com.dao.AdminRowMapperImpl;
import com.dao.RowMapperImpl;
import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.dao.StudentRowMapperImpl;
import com.model.Admin;
import com.model.Questions;
import com.model.Student;
import com.service.AdminCRUDService;
import com.service.Menus;
import com.service.StudentCRUDService;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Hello Servlet");
		return "index";
		
	}
	
	@RequestMapping("/checkadmins")
	public String adminPanel() {
		System.out.println("Hello Servlet");
		return "checkadmin";
		
	}
	
	@RequestMapping("/showdataadmin")
	public String admin(@RequestParam("aname") String adminname,@RequestParam("apwd") String adminpwd) {
		System.out.println("Hello Admin");
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Menus menu=context.getBean("allMenu",Menus.class);
		
		String query ="select * from admin_details where a_username=?";
		//String query ="select * from admin_details";
		RowMapper<Admin> rowMapper= new AdminRowMapperImpl();
		Admin admin;
		boolean flag=false;
		try {
		admin = jdbc.queryForObject(query, rowMapper, adminname);
		if(admin.getUsername().equals(adminname) && admin.getPassword().equals(adminpwd)) {
			System.out.println(admin.getUsername()+"if"+admin.getPassword());
		System.out.println("WELCOME TO ADMIN PANEL");
		System.out.println("================================================");
		flag=true;

		}
		}catch (Exception e) {
			System.out.println("You have enterd wrong admin and username       "+adminname);
			System.out.println(e.getMessage());
//			e.printStackTrace();
			return "Invalidcred";
		}
	if(flag) {
		return "adminOption";
	}else {
		return "Invalidcred";
	}
		
		
				
	}
//	
	@RequestMapping("/insertst")
	public String InsertstdPanel() {
		return "insertstd";
		
	}
	
	@RequestMapping("/insertdata")
	public String insertStudent(@RequestParam("sid") int sid,
			@RequestParam("suname") String suname,
			@RequestParam("spwd") String spwd,
			@RequestParam("sname") String sname) {
		
		
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		AadminDao adminDao = context.getBean("adminDao",AadminDaoImpl.class);
	 
		
		Student admin = new Student();
		admin.setSid(sid);
		admin.setUsername(suname);
		admin.setPassword(spwd);
		admin.setName(sname);
		
		int rowdata=adminDao.insertStudent(admin);
		System.out.println("Done..........");
		
		if(rowdata!=0) {
			return "addedSUCC";
			}else {
				return "unSUCC";
			}
	}
	
	@RequestMapping("/updatest")
	public String UpdatestdPanel() {
		return "updatestd";
		
	}
	
	
	@RequestMapping("/updatedata")
	public String updateStudent(@RequestParam("sid") int sid,
			@RequestParam("suname") String suname,
			@RequestParam("spwd") String spwd,
			@RequestParam("sname") String sname) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		AadminDao adminDao = context.getBean("adminDao",AadminDaoImpl.class);
	 
		
		Student admin = new Student();
		admin.setSid(sid);
		admin.setUsername(suname);
		admin.setPassword(spwd);
		admin.setName(sname);
		
		int rowdata=adminDao.updateStudent(admin);
		System.out.println("Done..........");
		
		if(rowdata!=0) {
			return "addedSUCC";
			}else {
				return "unSUCC";
			}
	}
	
	@RequestMapping("/deletest")
	public String DeletestdPanel() {
		return "deletestd";
	}
		
	@RequestMapping("/deletedata")
	public String addProductInDatabase(@RequestParam("sid") int sid) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		AadminDao adminDao = context.getBean("adminDao",AadminDaoImpl.class);
	 
		
		Student admin = new Student();
		admin.setSid(sid);
		
		int rowdata = adminDao.deleteStudent(admin);
		System.out.println("Done..........");
		if(rowdata!=0) {
		return "addedSUCC";
		}else {
			return "unSUCC";
		}
	}
	
	@RequestMapping("/insertqust")
	public String InsertqusPanel() {
		return "insertqus";
	}
	
	
	@RequestMapping("/insertques")
	public String insertQuestion(@RequestParam("aquid") int aquid,
			@RequestParam("aques") String aques,
			@RequestParam("aop1") String aop1,
			@RequestParam("aop2") String aop2,
			@RequestParam("aop3") String aop3,
			@RequestParam("aop4") String aop4,
			@RequestParam("acorrect") String acorrect) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		AadminDao adminDao = context.getBean("adminDao",AadminDaoImpl.class);
	 
		
		Questions admin = new Questions();
		admin.setQ_id(aquid);
		admin.setQues(aques);
		admin.setA(aop1);
		admin.setB(aop2);
		admin.setC(aop3);
		admin.setD(aop4);
		admin.setCorrect(acorrect);
		int rowdata = adminDao.insertQuestion(admin);
		System.out.println("Done..........");
		
		if(rowdata!=0) {
			return "addedSUCC";
			}else {
				return "unSUCC";
			}
	}
	
	@RequestMapping("/updatequst")
	public String UpdatequsPanel() {
		return "updatequs";
	}
	
	@RequestMapping("/updateques")
	public String updateStudent(@RequestParam("aquid") int aquid,
			@RequestParam("aques") String aques,
			@RequestParam("aop1") String aop1,
			@RequestParam("aop2") String aop2,
			@RequestParam("aop3") String aop3,
			@RequestParam("aop4") String aop4,
			@RequestParam("acorrect") String acorrect) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		AadminDao adminDao = context.getBean("adminDao",AadminDaoImpl.class);
	 
		
		Questions admin = new Questions();
		admin.setQ_id(aquid);
		admin.setQues(aques);
		admin.setA(aop1);
		admin.setB(aop2);
		admin.setC(aop3);
		admin.setD(aop4);
		admin.setCorrect(acorrect);
		int rowdata = adminDao.updateQuestion(admin);
		System.out.println("Done..........");
		
		if(rowdata!=0) {
			return "addedSUCC";
			}else {
				return "unSUCC";
			}
	}
	
	@RequestMapping("/deletequst")
	public String DeletequsPanel() {
		return "deletequs";
	}
	
	@RequestMapping("/deleteques")
	public String deleteQuestion(@RequestParam("qid") int qid) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		AadminDao adminDao = context.getBean("adminDao",AadminDaoImpl.class);
	 
		
		Questions adque = new Questions();
		adque.setQ_id(qid);
		int rowdata = adminDao.deleteQuestion(adque);
		System.out.println("Done..........");
		if(rowdata!=0) {
		return "addedSUCC";
		}else {
			return "unSUCC";
		}
	}
	
	@RequestMapping("/selectstid")
	public String SelectstdIdPanel() {
		return "showstdByid";
	}
	
	@RequestMapping("/showStudentByID")
	public String displayStudentByID(@RequestParam("sid") int sid,Model model) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		AadminDao adminDao = context.getBean("adminDao",AadminDaoImpl.class);
		Student std = new Student();
		std.setSid(sid);
		int sids=std.getSid();
		List<Student> stddetailsbyid=new ArrayList<Student>();
		Student std1 = adminDao.getStudent(sids);
		Student std11 = new Student();
		std11.setSid(std1.getSid());
		std11.setUsername(std1.getUsername());
		std11.setPassword(std1.getPassword());
		std11.setName(std1.getName());
		stddetailsbyid.add(std1);
		model.addAttribute("StudentListByID",stddetailsbyid);
		return "displaystdbyID";
	}
	
	
	@RequestMapping("/showAllStudent")
	public String displayAllStudent(Model model) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		AadminDao adminDao = context.getBean("adminDao",AadminDaoImpl.class);
		List<Student> stdDetails = adminDao.getAllStudents();
		model.addAttribute("allStudentList",stdDetails);
		return "displaystd";
	}
	
	
	@RequestMapping("/studentcheck")
	public String studentPanel() {
		System.out.println("Hello Student");
		return "studentcheck";
		
	}
	
	
	
	@RequestMapping("/showdatastd")
	public String stdCheck(@RequestParam("suname") String suname,@RequestParam("spwd") String spwd,@RequestParam("sname") String sname,Model model) {
		System.out.println("Hello Admin");
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Menus menu=context.getBean("allMenu",Menus.class);
		String squery ="select * from student where s_username=?";
		RowMapper<Student> srowMapper= new StudentRowMapperImpl();
		Student std = menu.getJdbcTemplate().queryForObject(squery,srowMapper,suname);
	
		if(std.getUsername().equals(suname) && std.getPassword().equals(spwd)) {
			System.out.println("WELCOME TO EXAM PANEL");
			System.out.println("================================================");
//			return "studentOption";
		}
		
		model.addAttribute("name",sname);
		return "studentOption";
		
	}
	
//	@RequestMapping("/stdexam")
//	public String studentexamPanel() {
//		System.out.println("Hello Student");
//		return "stdexamresult";
//		
//	}
	@Autowired
	Menus menu;
	@Autowired
	JdbcTemplate jdbc;
	
	@RequestMapping("/stdexam")
	public String studentexamCheck(Model model) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-servlet");
//		Menus menu=context.getBean("allMenu",Menus.class);
		Scanner input = new Scanner(System.in);
		int count=0;
		System.out.println("Hello");
		String query ="select * from question";
		List<Questions> qstd = jdbc.query(query, new RowMapperImpl());
		
		


		model.addAttribute("questions",qstd);
		return "stdexamresult";
		
	}
	
	@RequestMapping("/submittest")
	public String studentTestSubmit(@RequestParam("count") int count,Model m) {

		
		int counttotal=count;
		System.out.println("Complete Test");
		m.addAttribute("counttotal",counttotal);
		
		if(counttotal==0||counttotal<=5) {
			
			 System.out.println("Exam Finished");
			 System.out.println("Your Score is:"+counttotal+"out of 10");
			 System.out.println("You Are Failed Kindly try again");
			 System.out.println("THank YOU!!!");
			 return "showresult";
		 }else {
			
			 System.out.println("Exam Finished");
			 System.out.println("Your Score is:"+counttotal+"out of 10");
			 System.out.println("Successfully Passed Exam");
			 System.out.println("THank YOU!!!");
			 return "failresult";
		 }


		
		
		
	}
}	
