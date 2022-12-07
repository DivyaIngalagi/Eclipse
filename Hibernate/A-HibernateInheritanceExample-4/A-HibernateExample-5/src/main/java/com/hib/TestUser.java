package com.hib;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
		
		User us=(User)session.get(User.class, 3);
		System.out.println(us);
		
		System.out.println("************");
		
		User us1=(User)session.get(User.class, 3);
		System.out.println(us1);
				
		session.evict(user);
		
		 session=factory.openSession();
		session.beginTransaction();
		
		User us3=(User)session.get(User.class, 3);
		System.out.println(us3);
		
		System.out.println("************");
		
		User us2=(User)session.get(User.class, 4);
		System.out.println(us2);
		session.close();
		
		
		
		
	}

}
