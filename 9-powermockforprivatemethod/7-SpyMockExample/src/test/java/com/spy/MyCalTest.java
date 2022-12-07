package com.spy;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

import org.junit.jupiter.api.Test;

class MyCalTest {

	@Test
	void test() {
		MyCal cal=spy(MyCal.class);
		int result=cal.multiply(20, 10);
		assertEquals(200,result);
		
		
		MyCal cal1=mock(MyCal.class);
		int result1=cal1.multiply(20, 10);
//		assertEquals(200,result1);
		
		assertEquals(0,result1);
	}

}
