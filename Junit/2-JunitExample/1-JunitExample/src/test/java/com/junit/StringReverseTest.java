package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringReverseTest {
	
    StringReverse stringReverse; 
    
    public void doSetUp()
    {
    	stringReverse=new StringReverse();
    }
	
	@Test
	void testCheckStringReverse() {
		
		String actual= stringReverse.checkStringReverseMethod("Bhawana");
		
		assertEquals("anawahb",actual);
		
	}

}
