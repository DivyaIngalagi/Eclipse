package com.hibernatesave;

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
		User user1 = new User();
		user1.setName("BBBB");

		User user2 = new User();
		user2.setName("HHHH");


		session.persist(user);
		session.persist(user1);
		session.persist(user2);
		
		User u=(User)session.get(User.class, 1);
		u.setName("My Name");

		session.update(u);
		session.getTransaction().commit();

		session.close(); // detacthed

		
		Session session1 = factory.openSession();
		session1.beginTransaction();
	
		
		u.setName("New Name after fectching");
		
	 session1.update(u);  //reattaching it copy the state

		u.setName("Alex");
		
//		u.setName("Alex1");

		session1.getTransaction().commit();
		session1.evict(user);
	}

}




/*
 * SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession(); // associated first level cache is also open to use
		//by default FirstLEVELCache Enabled
		Transaction tx=session.beginTransaction();

		User user=new User();
		user.setName("Anna");
		user.setAddress("Mumbai");
		
		session.persist(user);
		
		user.setName("msss");
		User u=(User)session.get(User.class, 1);
		System.out.println(u);
		u.setName("Mocka");
		session.persist(u);
		User u1=(User)session.get(User.class, 1);
		System.out.println(u1);
		
		System.out.println(session.contains(u1));//check any obj is there in session cache
		tx.commit();
		session.close();
 */
