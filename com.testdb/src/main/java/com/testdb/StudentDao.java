package com.testdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

	
	public static boolean insertstudentDao(Student st) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		boolean f=false;
		Connection con = ConnClass.createCP();
		String s="insert into students(sname,phone,city)values(?,?,?)";
		
		PreparedStatement pstmt=con.prepareStatement(s);
		
		pstmt.setString(1, st.getSname());
		pstmt.setString(2, st.getSphone());
		pstmt.setString(3, st.getScity());
		
		pstmt.executeUpdate();
		f=true;
		
		return f;
	}

	public static int deletestudentDao(int sid)  {
		// TODO Auto-generated method stub
		
//		boolean f=false;
		int count = 0;
		try {
		Connection con = ConnClass.createCP();
		String s="delete from students where sid=?";
		
		PreparedStatement pstmt=con.prepareStatement(s);
		
		pstmt.setInt(1, sid);
		
		
		count = pstmt.executeUpdate();
		
		System.out.println(count);
		
		
		
		if(count==0) {
			System.out.println("Record not Found for Id"+sid);
//			f=false;
		}else {
			System.out.println("Number of record deleted"+count);
//			f=true;
			System.out.println("Deleted successfully...");
    		

		}
		
		}catch (Exception e) {
			
//			f=false;
			System.out.println("Something went wrong try again....");
			
		}
		return count;
	}

	public static List<Student> showAllStudent() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection con = ConnClass.createCP();
		
		List<Student> lst =  new ArrayList<Student>();
		
		String s="select * from students";
		
		Statement stmt=con.createStatement();
		
		ResultSet set = stmt.executeQuery(s);
		
		while(set.next()) {
			int id = set.getInt(1);
			String name = set.getString(2);
			String phone = set.getString(3);
			String city = set.getString(4);
			
			Student s1 = new Student();
			
			s1.setSid(id);
			s1.setSname(name);
			s1.setSphone(phone);
			s1.setScity(city);
			
			
			
			
			System.out.println("ID:"+id);
			System.out.println("Name:"+name);
			System.out.println("Phone:"+phone);
			System.out.println("City:"+city);
			
			System.out.println("===================================");
			
			lst.add(s1);
	}
		
		
		
		return lst;
	}
	
	public static int updatestudentDao(int sid,String name,String phone,String city)  {
		// TODO Auto-generated method stub
		
		int count = 0;
		try {
		Connection con = ConnClass.createCP();
		String s="update  students set sname=?,phone=?,city=? where sid=?";
		PreparedStatement pstmt=con.prepareStatement(s);
		
		pstmt.setString(1, name);
		pstmt.setString(2, phone);
		pstmt.setString(3, city);
		pstmt.setInt(4, sid);
		count = pstmt.executeUpdate();
		
		if(count==0) {
			System.out.println("Record not found for given id"+sid);
		}else {
			System.out.println("Data Updated successfully...");
		}
		}catch (Exception e) {
			System.out.println("Something went wrong try again....");
		}
		return count;
	}
	
	
	public static Student selectStudentById(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection con = ConnClass.createCP();
		
		Student s1 = new Student();
		
		String s="select * from students where sid=?";
		
		PreparedStatement pstmt=con.prepareStatement(s);
		
		pstmt.setInt(1, id);
		
		ResultSet set = pstmt.executeQuery();
		
		
		
		while(set.next()) {
			int id1 = set.getInt(1);
			String name = set.getString(2);
			String phone = set.getString(3);
			String city = set.getString(4);
			
			
			
			s1.setSid(id1);
			s1.setSname(name);
			s1.setSphone(phone);
			s1.setScity(city);
			
			
			
	}
		
		
		
		return s1;
	}

}
	
