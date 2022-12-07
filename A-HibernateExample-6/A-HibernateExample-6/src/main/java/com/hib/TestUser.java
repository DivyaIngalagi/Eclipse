package com.hib;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestUser {

	public static void main(String[] args) {

		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();  // associated first level cache is also open to use
		session.beginTransaction();
		
		User user=new User();
		user.setName("Anna");
		user.setAddress("Mumbai");
		
		
	//	Integer ss=(Integer)session.save(user);		 // store user object in DB as well as in First level
	//	System.out.println(ss);
		
		//session.persist(user);
		
		
	User us	=(User)session.get(User.class, 1);
	System.out.println(us);
		
		session.close();
		
		
		Session session1=factory.openSession();
		session1.beginTransaction();
		
		User us1	=(User)session1.get(User.class, 1);
		System.out.println(us1);
	}
	
	

}
