package com.hibernate4;

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
		User_backup user=new User_backup();
		user.setName("Alax");
		user.setHomeAddress(homeadd);
		user.setOfficeAddress(Offadd);//It will give error address contains to time city and state so we handle it by change the column we use @AttributeOverides
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();  // associated first level cache is also open to use
		session.beginTransaction();
		
		
		//Object is in persistence state
		session.save(user);		 // store user object in DB as well as in First level
		session.getTransaction().commit();
		
		session.close();
	}

}
