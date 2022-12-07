package com.hib;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestUser {

	public static void main(String[] args) {
		
		
	Product prod=new Product();
	prod.setProdName("SmallElectornicDevice");
	
	
	Mobile mob=new Mobile();
	mob.setMobBrand("AAA");
	mob.setRamSize(121);
	
	
	Laptop laptop=new Laptop();
	laptop.setLaptopBrand("BBB");	
	laptop.setMemory(1001);
		

		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();  // associated first level cache is also open to use
		session.beginTransaction();
		
		
		//Object is in persistence state
		session.save(prod);	
		session.save(mob);
		session.save(laptop);
		
		session.getTransaction().commit();
		
		session.close();
	}

}
