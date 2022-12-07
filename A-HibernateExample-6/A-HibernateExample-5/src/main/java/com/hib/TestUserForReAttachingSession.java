package com.hib;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUserForReAttachingSession {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession(); // associated first level cache is also open to use
		session.beginTransaction();

		User user = new User();
		user.setName("DDDD");

		session.persist(user);
		
		
		User u=(User)session.get(User.class, 2);
		u.setName("My Name");

		session.update(u);
		session.getTransaction().commit();

		session.close(); // detacthed

		
		Session session1 = factory.openSession();
		session1.beginTransaction();
	
		
		user.setName("New Name after fectching");
		
	session1.merge(user);  //reattaching 

		//user.setName("Alex");

		session1.getTransaction().commit();
		session1.evict(user);
	}

}
