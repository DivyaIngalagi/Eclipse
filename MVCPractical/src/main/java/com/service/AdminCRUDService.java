package com.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.AadminDao;
import com.dao.AadminDaoImpl;
import com.model.Admin;
import com.model.Questions;
import com.model.Student;

public class AdminCRUDService {
	
	Scanner input = new Scanner(System.in);
	
	AdminCRUDService(){
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		AadminDao adminDao = context.getBean("adminDao",AadminDaoImpl.class);
		int choice=0;
		
		do {
			Scanner scan=new Scanner(System.in);
			System.out.println("---MENU---");
			System.out.println("1.Add Question\n2.Update Question\n3. Delete Question\n4.Add Student\n5.Update Student\n6.Delete Student\n7.Get Single Students Details\n8.Can get all Students Details\n0.Exit");
			System.out.println("------------------");
			System.out.println("Enter your choice");
		choice=input.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter QuestionID");
			int aquid=input.nextInt();
			input.nextLine();
			System.out.println("Enter Question");
			String aques=input.nextLine();
			
			System.out.println("Enter Option1");
			String aop1=input.nextLine();
//			input.nextLine();
			System.out.println("Enter Option2");
			String aop2=input.nextLine();
//			input.next();
			System.out.println("Enter Option3");
			String aop3=input.nextLine();
//			input.next();
			System.out.println("Enter Option4");
			String aop4=input.nextLine();
//			input.next();
			System.out.println("Enter Correct Option");
			String acorrect=input.next();
			Questions admin = new Questions();
			admin.setQ_id(aquid);
			admin.setQues(aques);
			admin.setA(aop1);
			admin.setB(aop2);
			admin.setC(aop3);
			admin.setD(aop4);
			admin.setCorrect(acorrect);
			int rowInserted = adminDao.insertQuestion(admin);
			System.out.println(rowInserted+" Rows inserted");
			break;
			
		case 2:
			System.out.println("Enter QuestionID");
			int aquid1=input.nextInt();
			input.nextLine();
			System.out.println("Enter Question");
			String aques1=input.nextLine();
//			input.nextLine();
			System.out.println("Enter Option1");
			String aop11=input.nextLine();
//			input.nextLine();
			System.out.println("Enter Option2");
			String aop21=input.nextLine();
//			input.nextLine();
			System.out.println("Enter Option3");
			String aop31=input.nextLine();
//			input.nextLine();
			System.out.println("Enter Option4");
			String aop41=input.nextLine();
//			input.nextLine();
			System.out.println("Enter Correct Option");
			String acorrect1=input.next();
			Questions admin1 = new Questions();
			admin1.setQ_id(aquid1);
			admin1.setQues(aques1);
			admin1.setA(aop11);
			admin1.setB(aop21);
			admin1.setC(aop31);
			admin1.setD(aop41);
			admin1.setCorrect(acorrect1);
			int rows = adminDao.updateQuestion(admin1);
			System.out.println(rows+" Updated");
			break;
			
		case 3:
			Questions adque = new Questions();
			System.out.println("Enter Question Id");
			int unm1=input.nextInt();
			adque.setQ_id(unm1);
			int rows1 = adminDao.deleteQuestion(adque);
			System.out.println(rows1+" Deleted");
			break;
			
		case 4:
			System.out.println("Enter StudentId");
			int sid1=input.nextInt();
			System.out.println("Enter UserName");
			String suname1=input.next();
			System.out.println("Enter Password");
			String pwd1=input.next();
			System.out.println("Enter Student Name");
			String sname1=input.next();
			Student stdI = new Student();
			stdI.setSid(sid1);
			stdI.setUsername(suname1);
			stdI.setPassword(pwd1);
			stdI.setName(sname1);
			int rowInserted1 = adminDao.insertStudent(stdI);
			System.out.println(rowInserted1+" Rows inserted");
			break;
			
		case 5:
			System.out.println("Enter StudentId");
			int sid2=input.nextInt();
			System.out.println("Enter UserName");
			String suname2=input.next();
			System.out.println("Enter Password");
			String pwd2=input.next();
			System.out.println("Enter Student Name");
			String sname2=input.next();
			Student uadmin2 = new Student();
			uadmin2.setUsername(suname2);
			uadmin2.setPassword(pwd2);
			uadmin2.setName(sname2);
			uadmin2.setSid(sid2);
			int rows11 = adminDao.updateStudent(uadmin2);
			System.out.println(rows11+" Updated");
			break;
		case 6:
			Student dadmin = new Student();
			System.out.println("Enter Student Id");
			int unm=input.nextInt();
			dadmin.setSid(unm);
			int rowdelete = adminDao.deleteStudent(dadmin);
			System.out.println(rowdelete+" Deleted");
			break;
		case 7:
			System.out.println("Enter Student Id");
			int suname11=input.nextInt();
			Student std1 = adminDao.getStudent(suname11);
			System.out.println("Student Details");
			System.out.println("================================================");
			System.out.println("Student ID="+std1.getSid()+"\n"+"UserName="+std1.getUsername()+"\n"+"Password="+std1.getPassword()+"\n"+"StudentName="+std1.getName());
			System.out.println("================================================");
			break;
		case 8:
			List<Student> stdDetails = adminDao.getAllStudents();
			for(Student allstd:stdDetails) {
				System.out.println("Students Details");
				System.out.println("================================================");
				System.out.println("Student ID="+allstd.getSid()+"\n"+"UserName="+allstd.getUsername()+"\n"+"Password="+allstd.getPassword()+"\n"+"StudentName="+allstd.getName());
				System.out.println("================================================");
			}
			break;
		}
		}while(choice!=0);
//		if(choice==1) {		
//		//insert operation
//		System.out.println("Enter Product Id");
//		int prod_id=input.nextInt();
//		System.out.println("Enter Product Name");
//		String prod_name=input.next();
//		System.out.println("Enter Product Price");
//		float prod_price=input.nextInt();
//		Product product = new Product();
//		product.setProd_id(prod_id);
//		product.setProd_name(prod_name);
//		product.setProd_price(prod_price);
//		int rowInserted = productDao.insertProduct(product);
//		System.out.println(rowInserted+" Rows inserted");
//		}
//		else if(choice==2) {
//			//delete
//			Product product = new Product();
//			System.out.println("Enter Product Id");
//			int prod_id=input.nextInt();
//			product.setProd_id(prod_id);
//			int rows = AadminDao.deleteProduct(product);
//			System.out.println(rows+" Deleted");
//			
//		}
//		else if(choice==3) {
//			Product product = new Product();
//			System.out.println("Enter Product Id");
//			int prod_id=input.nextInt();
//			System.out.println("Enter Product Name");
//			String prod_name=input.next();
//			product.setProd_id(prod_id);
//			product.setProd_name(prod_name);
//			int rows = AadminDao.updateProduct(product);
//			System.out.println(rows+" Updated");
//			
//		}else if(choice==4) {
//			//display product using ID
//			System.out.println("Enter Product Id");
//			int prod_id=input.nextInt();
//			Product product = AadminDao.getProduct(prod_id);
//			System.out.println(product.getProd_id()+"-"+product.getProd_name()+"-"+product.getProd_price());
//			
//		}
//		else if(choice==5) {
//			//display all products
//			List<Product> product = AadminDao.getAllProducts();
//			for(Product prod:product) {
//				System.out.println("Product ID ="+prod.getProd_id()+" Product Name ="+prod.getProd_name()+" Product Price ="+prod.getProd_price());
//				
//			}
//		}
//		
		
		
		
	}
	

}
