package com.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringReverseTest {
	
	StringReverse stringReverse=new StringReverse();

	@Test
	void testCheckStringReverse() {
		String actual=stringReverse.checkStringReverse("Divya");
		assertEquals("ayviD",actual);
	}


}
