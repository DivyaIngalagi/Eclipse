package com.testFinal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
@RunWith(PowerMockRunner.class)
@PrepareForTest(FinalMockClass.class)
class FinalmethodTest {

	@Test
	void testFinalMethod() throws Exception {
		String message = " I am using  power mock for Final ";

		FinalMockClass finalmockclass = PowerMockito.mock(FinalMockClass.class);

		PowerMockito.whenNew(FinalMockClass.class).withNoArguments().thenReturn(finalmockclass);

		FinalMockClass finalmock = new FinalMockClass();
		PowerMockito.verifyNew(FinalMockClass.class).withNoArguments();

		PowerMockito.when(finalmock.getMessage(message)).thenReturn(message);

		String message2 = finalmock.getMessage(message);
		Mockito.verify(finalmock).getMessage(message);
		assertEquals(message, message2);
	}

}
