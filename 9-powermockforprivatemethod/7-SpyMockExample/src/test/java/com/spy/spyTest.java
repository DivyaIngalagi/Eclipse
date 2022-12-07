package com.spy;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class spyTest {

	@Test
	public void test() {
//		List arryListMock= spy(ArrayList.class);
//		assertEquals(0, arryListMock.size());
//		
//		arryListMock.add("dummy");
//		arryListMock.add("abc");
//		System.out.println(arryListMock);
//		assertEquals(2, arryListMock.size());
//		assertEquals(1, arryListMock.size());
		
		List arryListMock= mock(ArrayList.class);
//		assertEquals(0, arryListMock.size());
//		
		arryListMock.add("dummy");
		arryListMock.add("abc");
		System.out.println("hi "+arryListMock);
		assertEquals(2, arryListMock.size());
		assertEquals(1, arryListMock.size());
	}

}
