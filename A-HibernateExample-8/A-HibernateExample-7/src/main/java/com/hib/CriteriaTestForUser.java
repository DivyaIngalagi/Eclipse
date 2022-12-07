package com.hib;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.hql.internal.ast.tree.RestrictableStatement;
import org.hibernate.query.Query;

public class CriteriaTestForUser {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession(); // associated first level cache is also open to use
		session.beginTransaction();

		User user = new User();
		user.setName("Green");
		user.setAddress("NewColour");
		user.setSalary(63000);

		// session.save(user);

		// Hibernate 4
		/*Criteria criteria = session.createCriteria(User.class);
		// criteria.add(Restrictions.eq("name", "Blue"));
		criteria.add(Restrictions.gt("salary", 90000));
		criteria.addOrder(Order.asc("salary"));

		List<User> userlist1 = criteria.list();
		for (User u : userlist1) {
			System.out.println(u);
		}*/

		// Hiberante 5

		// create Builder object
		CriteriaBuilder builder = session.getCriteriaBuilder();

		//create the query 
		CriteriaQuery<User> query = builder.createQuery(User.class);
		
		//we are using from clause and start the query
		Root<User> root=query.from(User.class);
		
		
		// for adding the parameter which we to pass in where clause
		ParameterExpression<String> userParam=	builder.parameter(String.class);
		
		
		//
		query.where(builder.equal(root.get("name"),userParam));
		
		Query finalQuery=session.createQuery(query);
		finalQuery.setParameter(userParam, "Blue");
		
		List<User> userlist2 = finalQuery.list();
		for (User u : userlist2) {
			System.out.println(u);
		}
		session.getTransaction().commit();

		session.close();

	}

}
