package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class TestArraySort {

	@Test
	@Tag("ArraySort")
	void testSortArray() {
		
		int arr[]= {8,1,21,3,7};
		int expected[]= {1,3,7,8,21};
		
		Arrays.sort(arr);
		
		assertArrayEquals(expected,arr);
	}
	
	
	@Test
	@Tag("CheckingException")
	public void testArraySort_ExceptionHandling()
	{
		assertThrows(NullPointerException.class, ()->{
		int[] arr=null;
		Arrays.sort(arr);
	});
}
	
	@Test
	@Timeout(value=100,unit=TimeUnit.MILLISECONDS)
	void testSortArray_performance() {
		
		int arr[]= {8,1,21,3,7};
		for(int i=0;i<=1000000;i++)
		{
			arr[0]=i;
			Arrays.sort(arr);
		}
		
		
		
		
	}
}
