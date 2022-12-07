package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestCustomer {

	public static void main(String[] args) {

		/*
		 * BeanFactory factory=new XmlBeanFactory(new
		 * ClassPathResource("springconf.xml")); factory.getBean("cust",Customer.class);
		 */
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("springconf.xml");
		Customer customer=context.getBean("cust1",Customer.class);
		
		System.out.println(customer);
	}

}
