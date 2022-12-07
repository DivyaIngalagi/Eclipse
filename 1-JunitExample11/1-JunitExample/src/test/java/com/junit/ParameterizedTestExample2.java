package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestExample2 {

	
	CheckString checkString=new CheckString();
	
	@ParameterizedTest
	@ValueSource(ints= {2,4,6,8,10,20,80,60})
	public void testNumberIsEven(int number)
	{
		Assertions.assertTrue(CheckEvenNumber.isEven(number));
	}
	
	
//	@ParameterizedTest
	//@CsvSource({"AACD,CD",
	//		"ABCD" ,"BCD",
	//		"CCGD, CCGD"})
//	
//	@CsvFileSource(resources ="/myExcelfile.csv",numLinesToSkip=1)
//	public void testparameter(String input,String output)
//	{
//		assertEquals(output, checkString.TruncateAtFirstAnd2Position(input));
//	}
}
