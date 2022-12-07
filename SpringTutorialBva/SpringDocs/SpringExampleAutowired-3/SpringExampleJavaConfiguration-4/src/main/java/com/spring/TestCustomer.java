package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestCustomer {

	public static void main(String[] args) {

		/*
		 * BeanFactory factory=new XmlBeanFactory(new
		 * ClassPathResource("springconf.xml")); factory.getBean("cust",Customer.class);
		 */
		
		/*
		 * ClassPathXmlApplicationContext context=new
		 * ClassPathXmlApplicationContext("springconf.xml"); Customer
		 * customer=context.getBean("cust1",Customer.class);
		 * 
		 * System.out.println(customer);
		 * 
		 * context.close();
		 */
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
//		Customer customer=context.getBean("customer",Customer.class);//for component
//		Customer customer=context.getBean("obj",Customer.class);
		Customer customer=context.getBean("customerBean",Customer.class);//for bean
		
		System.out.println(customer);
		context.close();
	}

}
