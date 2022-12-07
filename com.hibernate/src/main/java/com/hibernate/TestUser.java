package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestUser {
	public static void main(String[] args) {



		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession(); // associated first level cache is also open to use
		session.beginTransaction();

		User user=new User();
		user.setName("Alex");

		Integer ss=(Integer)session.save(user);		 // store user object in DB as well as in First level
			System.out.println(ss);
//			session.persist(user);
		session.save(user); // store user object in DB as well as in First level
		session.close();
}
}
