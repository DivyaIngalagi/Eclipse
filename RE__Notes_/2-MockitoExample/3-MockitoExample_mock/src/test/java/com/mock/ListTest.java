package com.mock;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Matchers.anyInt;

public class ListTest {
	
	@Test
	public void letsMockListSize()
	{
		List list=mock(List.class);
		Mockito.when(list.size()).thenReturn(10);
		assertEquals(10, list.size());
		
		
	}

	
	@Test
	public void letsMockListSize_ReturnMultipleValues()
	{
		List list=mock(List.class);
		Mockito.when(list.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, list.size());
		assertEquals(20, list.size());
		
		
	}
	
//	@Test
//	public void letsMockListGet()
//	{
//		List<String> list=mock(List.class);
//		Mockito.when(list.get(0)).thenReturn("Junit Trainig");
//		assertEquals("Junit Trainig", list.get(0));
//		//assertEquals(20, list.size());
//		
//		
//	}
	
//	@Test
//	public void letsMockListAny_withException()
//	{
//		List<String> list=mock(List.class);
//		Mockito.when(list.get(anyInt())).thenThrow(new RuntimeException());
//		assertEquals("Junit Trainig", list.get(0));
//		list.get(0);
//		
//		
//	}
	
//	@Test
//	public void Add_Test()
//	{
//		Add d=mock(Add.class);
//		Mockito.when(d.add(10, 20)).thenReturn(30);
//		assertEquals(30	,d.add(10, 20));
//		
//		
//	}
	
	@Test
	public void Add_Test1()
	{
		Add d=mock(Add.class);
		Mockito.when(d.add(10, 20)).thenReturn(30);
		assertEquals(30	,d.add(10, 20));
		
		
	}
}
