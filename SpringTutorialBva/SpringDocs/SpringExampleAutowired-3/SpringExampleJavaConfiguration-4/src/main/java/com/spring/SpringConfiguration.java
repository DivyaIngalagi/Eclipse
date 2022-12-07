package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.spring")//it worked to scan all @componenets annotations if we dont write this we cannot acces object
public class SpringConfiguration {

	
	
//	 @Bean(name="customer")
//	 public Customer customerBean() { Customer customer=new
//	  Customer(); return customer; }
	
	 @Bean//If we dont write name it use function name has to pass there in main clas k
	 public Customer customerBean() { Customer customer=new
	  Customer(); return customer; }
	 
}
