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
		
		

		
		session.persist(user);
		
	
		
		/*
		 * Query query=session.createQuery("from User");
		 * 
		 * List<User> userlist=query.list();//unique result for(User u:userlist) {
		 * System.out.println(u); }
		 */
	
		
		/*
		 * Query
		 * query=session.createQuery("from User u where u.name=:x and u.address=:y");
		 * query.setParameter("x", "Black"); query.setParameter("y", "NewColour");
		 * 
		 * List<User> userlist=query.list(); for(User u:userlist) {
		 * System.out.println(u); }
		 */
		
		// Pagination
		
		
		
		Query query1=session.createQuery("from User");
		query1.setFirstResult(0);
		query1.setMaxResults(5);
		
		List<User> userlist1=query1.list();
		for(User u:userlist1)
		{
			System.out.println(u);
		}
		
		
		session.close();
		
		
	}
	
	

}
