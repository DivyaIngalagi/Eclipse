package com.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLifeCycleAnnotation {
	
	@BeforeAll
	public static void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@BeforeEach
	public void setUp()
	{
		System.out.println("Before each method ");
	}

	@Test
	public void test1()
	{
		System.out.println("Executed Test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Executed Test2");
	}
	
	
	@AfterEach
	public void tearDown_Method1()
	{
		System.out.println("After each method ");
		
	}
	@AfterAll
	public static void tearDown_Method2()
	{
		System.out.println("After ALL ");
	}
}
