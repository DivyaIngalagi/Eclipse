package com.junit;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestArraySort.class,CheckStringTest.class })
public class AllTestsToRun {

	@Test
	public void test()
	{
		assertTrue(true);
	}
}
