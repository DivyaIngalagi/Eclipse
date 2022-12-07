package com.hib;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class TestUser {

	public static void main(String[] args) {

		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();  // associated first level cache is also open to use
		session.beginTransaction();
		
		User user=new User();
		user.setName("Black");
		user.setAddress("NewColour");
		
		

		
		//session.persist(user);
		
	
		
		
		Query query1=session.getNamedQuery("fetchUserById").setParameter("x", 5);
		
		
		List<User> userlist1=query1.list();
		for(User u:userlist1)
		{
			System.out.println(u);
		}
		
		
System.out.println("***********************");

		Query query2=session.getNamedQuery("fetchUserByName").setParameter("y", "Blue");
		
		
		List<User> userlist2=query2.list();
		for(User u:userlist2)
		{
			System.out.println(u);
		}
		
		session.close();
		
		
	}
	
	

}
