package com.testConstructor;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
@RunWith(PowerMockRunner.class)
@PrepareForTest({Constructorm.class,ConstructorCall.class} )
class ConstructormTest {

	@Test
	void test() throws Exception {
		ConstructorCall acall = new ConstructorCall();
		Constructorm cm = new Constructorm();
		Constructorm customer =mock(Constructorm.class);
        when(customer.getValue()).thenReturn("Success");
        
        PowerMockito.whenNew(Constructorm.class).withAnyArguments().thenReturn(customer);
        PowerMockito.whenNew(ConstructorCall.class).withAnyArguments().thenReturn(acall);
        
        String s = cm.getValue();
        
        assertEquals("Success",s);
	}

}
