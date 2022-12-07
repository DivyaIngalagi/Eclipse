package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

class ExecuteSuitClass {

	
	public static void main(String arg[])
	{
		
		Result result=JUnitCore.runClasses(AllTestsToRun.class);
		for(Failure failure:result.getFailures())
		{
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
	/*
	 * @Test void test() { fail("Not yet implemented"); }
	 */

}
