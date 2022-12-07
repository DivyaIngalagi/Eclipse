

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestUser {

	public static void main(String[] args) {
		
		
		Address Offadd=new Address();
		Offadd.setCity("AAA");
		Offadd.setState("AAA");
		
		
		Address homeadd=new Address();
		homeadd.setCity("BBB");
		homeadd.setState("BBB");
		
		Address peradd=new Address();
		peradd.setCity("CCC");
		peradd.setState("CCC");
		
		Collection<Address> address=new ArrayList<Address>();
		address.add(homeadd);
		address.add(Offadd);
		address.add(peradd);
		
		
		User user=new User();
		user.setName("Alax");
		user.setAddress(address);  // object is in traisent state
		
		

		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();  // associated first level cache is also open to use
		session.beginTransaction();
		
		
		//Object is in persistence state
		session.save(user);		 // store user object in DB as well as in First level
		session.getTransaction().commit();
		
		session.close();
	}

}
