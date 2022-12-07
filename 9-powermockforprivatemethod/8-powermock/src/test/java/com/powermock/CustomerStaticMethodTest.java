package com.powermock;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


@RunWith(PowerMockRunner.class)
@PrepareForTest(Customer.class)
public class CustomerStaticMethodTest {

	@Test
	public void testStaticMethod() {
		
		String mockmessgae="I am using power mock";
		
		PowerMockito.mockStatic(Customer.class);
		
		PowerMockito.when(Customer.sendMsg(mockmessgae)).thenReturn("I am using power mock");
		
		assertEquals("I am using power mock", mockmessgae);
	}

	
}
