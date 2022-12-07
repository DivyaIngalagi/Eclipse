package com.powermock;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.util.reflection.Whitebox;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


@RunWith(PowerMockRunner.class)
@PrepareForTest(Customer.class)
public class CustomerStaticMethodTest {
	
	
	Customer customer=PowerMockito.spy(new Customer());

	@Test
	public void testPrivateMethod() throws Exception {
		
		
		
		 	String message = "I am using power mock ";  
	                 
	        Customer customer =PowerMockito.spy(new Customer());  
	        PowerMockito.doReturn("I am using power mock").when(customer, "sendMsg", "I am using power mock");  
	          
	        String actualmessage = customer.publicMethodCallingPrivate("I am using power mock"); 
	        assertEquals("I am using power mock", actualmessage);  
	          
	}

	
}
