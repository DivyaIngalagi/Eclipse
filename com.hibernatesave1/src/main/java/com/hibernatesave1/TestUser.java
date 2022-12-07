package com.hibernatesave1;

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
	mob.setProdName("MAC");
	
	Laptop laptop=new Laptop();
	laptop.setLaptopBrand("BBB");	
	laptop.setMemory(1001);
	laptop.setProdName("Lenovo");
		

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

/*
ProductType	prodId	Prod_Name
Product	1	SmallElectornicDevice
Mobile_ChildClass	2	MAC
Laptop_childclass	3	Lenovo


1001 BBB 3
*/