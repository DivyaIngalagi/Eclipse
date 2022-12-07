package com.powermock;


 
import static org.junit.Assert.assertEquals;

import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.mockito.Mockito;  
import org.powermock.api.mockito.PowerMockito;  
import org.powermock.core.classloader.annotations.PrepareForTest;  
import org.powermock.modules.junit4.PowerMockRunner;  


@RunWith(PowerMockRunner.class)
@PrepareForTest(Bike.class)
public class RiderTest {
	
	  @Test  
	    public void TestFinalMethod_WithPowerMock() throws Exception {  
	          
	        String message = " PowerMock with Mockito and JUnit ";  
	        Bike bike = PowerMockito.mock(Bike.class);  
	        PowerMockito.whenNew(Bike.class).withNoArguments().thenReturn(bike);  
	          
	        Bike bike1 =  new Bike();  
	        PowerMockito.verifyNew(Bike.class).withNoArguments();  
	          
	        PowerMockito.when(bike1.finalMethod(message)).thenReturn(message);  
	          
	        String message2 = bike1.finalMethod(message);  
	        Mockito.verify(bike1).finalMethod(message);  
	        assertEquals(message, message2);  
	    }  
	 }   
