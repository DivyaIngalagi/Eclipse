package com.hibernate5;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Test_User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address Offadd=new Address();
		Offadd.setCity("AAA");
		Offadd.setState("AAA");
		
		
		Address homeadd=new Address();
		homeadd.setCity("BBB");
		homeadd.setState("BBB");
		Collection<Address> address = new ArrayList<Address>();
		address.add(homeadd);
		address.add(Offadd);
		
		User user=new User();
		user.setName("Alax");
		user.setAddress(address);//Two tables get created User and Useraddresstable
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();  // associated first level cache is also open to use
		session.beginTransaction();
		
		
		//Object is in persistence state
		session.save(user);		 // store user object in DB as well as in First level
		session.getTransaction().commit();
		
		session.close();
	}

}
