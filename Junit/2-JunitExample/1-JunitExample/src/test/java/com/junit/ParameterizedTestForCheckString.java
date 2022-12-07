package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTestForCheckString {
	
	CheckString checkString =new CheckString();
	
	//AACD->CD,  ACD --CD  , CBDE  -->CBDE  , CDAA -->CDAA
	
	private String input;
	private String exceptedOutput;
	
	
	public ParameterizedTestForCheckString(String input, String exceptedOutput) {
		this.input = input;
		this.exceptedOutput = exceptedOutput;
	}



   @Parameters
	public static List<String[]> testCondition()
	{
		String exceptedOutputs[][]= {
				{"AACD","CD"},
				{"ACD","CD"},
				{"CBDE","CBDE"},
				{"CDAA","CDAA"}};
		
		return Arrays.asList(exceptedOutputs);
	}
	
	
	
	@Test
	public void testTruncateAOnFirstAnd2ndPosition()
	{
		assertEquals(exceptedOutput, checkString.TruncateAtFirstAnd2Position(input));
	}
	
	

}
