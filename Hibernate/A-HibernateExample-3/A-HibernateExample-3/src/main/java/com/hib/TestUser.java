package com.hib;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestUser {

	public static void main(String[] args) {
		
		
		Patient patient=new Patient();
		patient.setPatName("Alex");
		
		
		
		Doctor doctor=new Doctor();
		doctor.setDocName("David");
		doctor.setPatient(patient);
		
		

		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();  // associated first level cache is also open to use
		session.beginTransaction();
		
		
		//Object is in persistence state
		session.save(doctor);	
		session.save(patient);	
		
		session.getTransaction().commit();
		
		session.close();
	}

}
