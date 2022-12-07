package com.testdb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException, ClassNotFoundException, SQLException
    {
        System.out.println( "Hello World!" );
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
        	System.out.println("Press 1 to ADD");
        	System.out.println("Press 2 to DELETE");
        	System.out.println("Press 3 to DISPLAY");
        	System.out.println("Press 4 to UPDATE");
        	System.out.println("Press 5 to EXIT");
        	int c=Integer.parseInt(br.readLine());
        	
        	
        	if(c==1) {
        		System.out.println("Enter username");
        		String name=br.readLine();
        		
        		System.out.println("Enter phonenumber");
        		String phone=br.readLine();
        		
        		System.out.println("Enter city");
        		String city=br.readLine();
        		
        		Student st = new Student(name,phone,city);
        		
        		System.out.println(st);
        		
        		boolean answer = StudentDao.insertstudentDao(st);
        		if(answer) {
        			System.out.println("Student added successfully...");
        		}else {
        			System.out.println("Something went wrong try again....");
        		}
        		
        	}else if(c==2) {
        		
        		System.out.println("Enter student id");
        		int stdid=Integer.parseInt(br.readLine());
        		
        		StudentDao.deletestudentDao(stdid);
        		        		
        	}else if(c==3) {
        		
        		
        		StudentDao.showAllStudent();
        	}else if(c==4) {
        		System.out.println("Enter student id");
        		int stdid=Integer.parseInt(br.readLine());
        		
        		System.out.println("Enter username");
        		String name=br.readLine();
        		
        		System.out.println("Enter phonenumber");
        		String phone=br.readLine();
        		
        		System.out.println("Enter city");
        		String city=br.readLine();
        		
        		StudentDao.updatestudentDao(stdid,name,phone,city);
        		
        	}else if(c==5) {
        		
        		break;
        	}else {
        		
        	}
        }
        
        System.out.println("THANK You");
    }
}
