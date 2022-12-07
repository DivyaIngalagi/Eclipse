package com.hibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession(); // associated first level cache is also open to use
		session.beginTransaction();

		Address add=new Address();
		add.setCity("Gokak");
		add.setState("Karnataka");
		User user=new User();
		user.setName("Alex");
		user.setAddress(add);

		session.save(user); // store user object in DB as well as in First level
		session.close();
	}

}
