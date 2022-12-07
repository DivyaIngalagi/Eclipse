package com.hibernate6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class TestUser {

	public static void main(String[] args) {
		
		
		Patient patient1=new Patient();
		patient1.setPatName("Alex");
		Patient patient2=new Patient();
		patient2.setPatName("Bob");
		
		List<Patient> patients = new ArrayList<Patient>();
		patients.add(patient1);
		patients.add(patient2);
		
		Doctor doctor=new Doctor();
		doctor.setDocName("David");
		doctor.setPatients(patients);
		
	
	    
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		
		
		
		session.save(doctor);
		session.save(patient1);	
		session.save(patient2);
			
		session.getTransaction().commit();
		
		session.close();
	}

}
