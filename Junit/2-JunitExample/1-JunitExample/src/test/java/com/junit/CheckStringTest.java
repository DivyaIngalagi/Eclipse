package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class CheckStringTest {
	
	static CheckString checkstring;
	
	@BeforeAll
	static  void getInstance()
	{
		checkstring =new CheckString();
		System.out.println("Before Each");
	}

	 
	
	/*
	 * @Test void testTruncateAtFirstAnd2Position() { CheckString checkstring =new
	 * CheckString(); String actual=checkstring.TruncateAtFirstAnd2Position("AACD");
	 * String expected="CD";
	 * 
	 * assertEquals(expected, actual);
	 * 
	 * }
	 */
	@Nested
	class TruncateACharacterFromString
	{
		@Test
		@DisplayName("StringWith_A_Character_FirstAndSecondPosition")
		@Tag("A_AT2postion")
		void testTruncateAtFirstAnd2Position_FirstCondition() {
			
			assertEquals("CD", checkstring.TruncateAtFirstAnd2Position("AACD"));
			
		}

		@Test
		@DisplayName("StringWith_A_Character_FirstPosition")
		//@Disabled
		@Tag("A_AT1postion")
		void testTruncateAtFirstAnd2Position_2ndCondition() {
			assertEquals("BCD", checkstring.TruncateAtFirstAnd2Position("ABCD"));
			
		}
		
		@Test
		@DisplayName("StringWithout_A_Character")
		@Tag("NoAChar")
		void testTruncateAtFirstAnd2Position_ThirdCondition() {
			
			assertEquals("KLMN", checkstring.TruncateAtFirstAnd2Position("KLMN"));
			
		}
	}
	
	@Nested
	class ArraySorting
	{
		@Test
		@Tag("ArraySort")
		void testSortArray() {
			
			int arr[]= {8,1,21,3,7};
			int expected[]= {1,3,7,8,21};
			
			Arrays.sort(arr);
			
			assertArrayEquals(expected,arr);
		}

		@Test
		@Tag("ExceptionCheck")
		public void testArraySort_ExceptionHandling()
		{
			assertThrows(NullPointerException.class, ()->{
			int[] arr=null;
			Arrays.sort(arr);
		});
	}	
	}
	
	
}
