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
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.hql.internal.ast.tree.RestrictableStatement;
import org.hibernate.query.Query;

public class CriteriaTestForUser {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession(); // associated first level cache is also open to use
		session.beginTransaction();

		User user = new User();
//		user.setName("Purple");
//		user.setAddress("HDFC1");
//		user.setSalary(7003);
//		 session.save(user);
//		 
		
		
		// Hibernate 4
		Criteria criteria = session.createCriteria(User.class);
//		 criteria.add(Restrictions.eq("name", "Blue"));
		
		//in
//		criteria.add(Restrictions.in("salary", 7000));
		//between
//		criteria.add(Restrictions.between("salary", 5000,7000));
		//like
//		criteria.add(Restrictions.like("name","A%",MatchMode.START));
		//max
//		criteria.setProjection(Projections.max("salary"));
//		List<User> userlist1 = criteria.list();
//		System.out.println(userlist1);
		//min
//		criteria.setProjection(Projections.min("salary"));
//		List<User> userlist1 = criteria.list();
//		System.out.println(userlist1);
		//avg
//		criteria.setProjection(Projections.avg("salary"));
//		List<User> userlist1 = criteria.list();
//		System.out.println(userlist1);
		//orderby
//		criteria.addOrder(Order.asc("salary"));
		//count
//		criteria.setProjection(Projections.count("name"));
//		List<User> userlist1 = criteria.list();
//		System.out.println(userlist1);
		//groupby
//		criteria.setProjection(Projections.groupb("salary"));
//		List<User> userlist1 = criteria.list();
//		System.out.println(userlist1);
//		List<User> userlist1 = criteria.list();
//		for (User u : userlist1) {
//			System.out.println(u);
//		}

		// Hiberante 5

		// create Builder object
//		//count
//		CriteriaBuilder builder = session.getCriteriaBuilder();
//
//	 
//		CriteriaQuery<Long> query = builder.createQuery(Long.class);
//		
//		
//		Root<User> root=query.from(User.class);
//		
//
//		
//		query.select(builder.count(root));
//		
//		
//		Query<Long> finalQuery=session.createQuery(query);
//		long count = finalQuery.getSingleResult();
//		
//		System.out.println("count rows:"+count);
		
		//max
//				CriteriaBuilder builder = session.getCriteriaBuilder();
//
//			 
//				CriteriaQuery<Integer> query = builder.createQuery(Integer.class);
//				
//				
//				Root<User> root=query.from(User.class);
//				
//
////				query.select(builder.min(root.get("empSalary")));
//				query.select(builder.max(root.get("salary")));
//				
//				
//				Query<Integer> finalQuery=session.createQuery(query);
//				int maxsal = finalQuery.getSingleResult();
//				
//				System.out.println("max salary is:"+maxsal);
				
				
				//max
//				CriteriaBuilder builder = session.getCriteriaBuilder();
//
//			 
//				CriteriaQuery<Integer> query = builder.createQuery(Integer.class);
//				
//				
//				Root<User> root=query.from(User.class);
//				
//
////				query.select(builder.min(root.get("empSalary")));
//				query.select(builder.min(root.get("salary")));
//				
//				
//				Query<Integer> finalQuery=session.createQuery(query);
//				int minsal = finalQuery.getSingleResult();
//				
//				System.out.println("min salary is:"+minsal);
		
		//avg
//		CriteriaBuilder builder = session.getCriteriaBuilder();
//
//	 
//		CriteriaQuery<Double> query = builder.createQuery(Double.class);
//		
//		
//		Root<User> root=query.from(User.class);
//		
//
////		query.select(builder.min(root.get("empSalary")));
//		query.select(builder.avg(root.get("salary")));
//		
//		
//		Query<Double> finalQuery=session.createQuery(query);
//		double avgsal = finalQuery.getSingleResult();
//		
//		System.out.println("avg salary is:"+avgsal);
		
		
//		//distinct
//		CriteriaBuilder builder = session.getCriteriaBuilder();
//
//		 
//		CriteriaQuery<Long> query = builder.createQuery(Long.class);
//		
//		
//		Root<User> root=query.from(User.class);
//		
//
////		query.select(builder.min(root.get("empSalary")));
//		query.select(builder.countDistinct(root.get("salary")));
//		
//		
//		Query<Long> finalQuery=session.createQuery(query);
//		Long distinct = finalQuery.getSingleResult();
//		
//		System.out.println("distinct data is:"+distinct);
				
//		//in
//				CriteriaBuilder builder = session.getCriteriaBuilder();
//
//				 
//				CriteriaQuery<User> query = builder.createQuery(User.class);
//				
//				
//				Root<User> root=query.from(User.class);
//				ParameterExpression<Integer> userParam=	builder.parameter(Integer.class);
//
//
//				query.where(builder.in(root.get("salary")));
//				
//				
//				Query<User> finalQuery=session.createQuery(query);
//
//				finalQuery.setParameter(userParam, 700);
//				
//				
//				List<User> userlist2 = finalQuery.list();
//				for (User u : userlist2) {
//					System.out.println(u);
//				}
	
//		//eq
//		CriteriaBuilder builder = session.getCriteriaBuilder();
//		//
////			 
//				CriteriaQuery<String> query = builder.createQuery(String.class);
//				
//				
//				Root<User> root=query.from(User.class);
//				
//		
//
//				query.select(root.get("name"));
//				query.where( builder.equal( root.get( "name" ), "Pink" ) );
//				
//				Query<String> finalQuery=session.createQuery(query);
//				List<String> userlist2 = finalQuery.getResultList();
//				for (String u : userlist2) {
//					System.out.println(u);
//				}
		
		//eqgt
//				CriteriaBuilder builder = session.getCriteriaBuilder();
//				//
////					 
//						CriteriaQuery<Integer> query = builder.createQuery(Integer.class);
//						
//						
//						Root<User> root=query.from(User.class);
//						
//				
//
//						query.select(root.get("salary"));
//						query.where( builder.greaterThanOrEqualTo( root.get( "salary" ), 7000 ) );
//						
//						Query<Integer> finalQuery=session.createQuery(query);
//						List<Integer> userlist2 = finalQuery.getResultList();
//						for (Integer u : userlist2) {
//							System.out.println(u);
//						}
		
		//groupby
//		CriteriaBuilder builder = session.getCriteriaBuilder();
//		//
////			 
//				CriteriaQuery<User> query = builder.createQuery(User.class);
//				
//				
//				Root<User> root=query.from(User.class);
//				
//		
//
//				query.groupBy(root.get("name"));
//				query.multiselect( root.get( "name" ), builder.count(root)  );
//				
//				Query<User> finalQuery=session.createQuery(query);
//				List<User> userlist2 = finalQuery.getResultList();
//				for (User u : userlist2) {
//					System.out.println(u);
//				}
				
		session.getTransaction().commit();

		session.close();

	}

}
