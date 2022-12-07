package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestExample2 {
	CheckString checkString =new CheckString();
	
	//another way to do
	

	@ParameterizedTest
	@ValueSource(ints= {2,4,6,8,100})
	public void testNumberIsEven(int number) {
//		Assertions.assertTrue(CheckEvenNumber.isEven(number));
		assertEquals(true, CheckEvenNumber.isEven(number));
	}
	
	
	@ParameterizedTest
	@CsvSource({"AACD,CD",
			"ACD,CD",
			"CBDE,CBDE",
			"CDAA,CDAA"})
//	@CsvFileSource("../CsvSource.xlsx")
	public void testNumberIsEven(String input,String output) {
		assertEquals(output, checkString.TruncateAtFirstAnd2Position(input));
	}
}
