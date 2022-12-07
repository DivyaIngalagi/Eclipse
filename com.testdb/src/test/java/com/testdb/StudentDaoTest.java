package com.testdb;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class StudentDaoTest {

	static StudentDao stdDao;
	static List<Student> stdnew;
	static Connection con;
	
	@BeforeAll
	public static void getinstance() throws ClassNotFoundException, SQLException 
	{
		StudentDao stdDao = new StudentDao();
		
		con = ConnClass.createCP();
		
		
		
		stdnew =  new ArrayList<Student>();
		Statement stmt=con.createStatement();
		String s="select * from students";
		ResultSet set = stmt.executeQuery(s);
		
		while(set.next()) {
			Student s1 = new Student();
			int id = set.getInt(1);
			String name = set.getString(2);
			String phone = set.getString(3);
			String city = set.getString(4);
			s1.setSid(id);
		s1.setSname(name);
		s1.setSphone(phone);
		s1.setScity(city);
		
		
		stdnew.add(s1);
		}
	}
	
	@Test
	void testStudentDelete() throws ClassNotFoundException, SQLException {
		
		assertEquals(0, stdDao.deletestudentDao(2));
		
	}
	
	@Test
	void testStudentDisplay() throws ClassNotFoundException, SQLException {
		
		List<Student> actualstd = stdDao.showAllStudent();
		
		Student actualsarray [] = new Student[actualstd.size()];
		int i=0;
		for(Student s : actualstd) {
			actualsarray[i++] = s;
		}
		
		
		
		
		Student expectedarray [] = new Student[stdnew.size()];
		int j=0;
		for(Student s : stdnew) {
			expectedarray[j++] = s;
		}

		
		assertArrayEquals(expectedarray, actualsarray);
//		assertEquals(stdnew.size(), std.size());
	}
	
	@Test
	void testStudentInsert() throws ClassNotFoundException, SQLException {
		
		Student s = new Student();
		s.setSname("Anand");
		s.setSphone("1212123132");
		s.setScity("Bangkok");
		
		
		
		assertTrue(stdDao.insertstudentDao(s));
		
		
	}
	
	@Test
	void testStudentUpdate() throws ClassNotFoundException, SQLException {
	
		stdDao.updatestudentDao(6,"Max","1212123312","Bangkok");
		
		Statement stmt=con.createStatement();
		String s="select * from students where sid=6";
		ResultSet set = stmt.executeQuery(s);
		Student st = new Student();
		while(set.next()) {
			
			int id = set.getInt(1);
			String name = set.getString(2);
			String phone = set.getString(3);
			String city = set.getString(4);
			st.setSname(name);
			
		}
		
		
		assertEquals("Max",st.getSname());
		
//		assertEquals(1,stdDao.updatestudentDao(6,"Max","1212123312","Bangkok"));
		
		
	}
	
	@Test
	void testStudentDisplayById() throws ClassNotFoundException, SQLException {
		
		Student std = stdDao.selectStudentById(6);
		
		Statement stmt=con.createStatement();
		String s="select * from students where sid=6";
		ResultSet set = stmt.executeQuery(s);
		Student st = new Student();
		while(set.next()) {
			
			int id = set.getInt(1);
			String name = set.getString(2);
			String phone = set.getString(3);
			String city = set.getString(4);
			st.setSid(id);
			st.setSname(name);
			st.setSphone(phone);
			st.setScity(city);
			
			
		}
		
//		assertEquals("Max",st.getSname());
		
		assertEquals(st,std);
	}

}
