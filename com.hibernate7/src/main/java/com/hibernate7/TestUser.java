package com.hibernate7;

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
		
		
		
		Doctor doctor1=new Doctor();
		doctor1.setDocName("David");
		Doctor doctor2=new Doctor();
		doctor2.setDocName("Mack");
		
	
		List<Patient> listpatients1 = new ArrayList<Patient>();
//		List<Patient> listpatients2 = new ArrayList<Patient>();
		List<Doctor> listdoctors1= new ArrayList<Doctor>();
//		List<Doctor> listdoctors2= new ArrayList<Doctor>();
		
		listpatients1.add(patient1);
		listpatients1.add(patient2);
		
		listdoctors1.add(doctor1);
		listdoctors1.add(doctor2);
		
	    doctor1.setPatients(listpatients1);
//	    doctor2.setPatients(listpatients2);
	    
	    patient2.setDoctors(listdoctors1);
//	    patient2.setDoctors(listdoctors2);
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		
		
		
		session.save(doctor1);
		session.save(doctor2);
		session.save(patient1);	
		session.save(patient2);
			
		session.getTransaction().commit();
		
		session.close();
	}

}
