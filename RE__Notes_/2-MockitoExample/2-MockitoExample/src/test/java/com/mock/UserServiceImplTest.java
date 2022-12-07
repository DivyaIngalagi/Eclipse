package com.mock;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

class UserServiceImplTest {

	@Test
	public void usingStub() {
     UserService userService=new UserServiceStub();
     UserServiceImpl userServiceImpl=new UserServiceImpl(userService);
     
    List<String>  user=userServiceImpl.retrieveFilteredUser();
     
     
     assertEquals(4, user.size());
     
	
	}
	
	@Test
	public void usingStub1() 
	{
		UserService userService=mock(UserService.class);
		userService.retrieveUser();
		
		verify(userService).retrieveUser();
	}

	@Test
	public void testDeleteNotRelatedUser_usingArgument() {
		
		//Given
		// define Argument Capture
		ArgumentCaptor<String> argumentCapture=ArgumentCaptor.forClass(String.class);
		 UserService userService=mock(UserService.class);
	     List<String> userlist=Arrays.asList("Bhawana Bhan","Anil Bhan","orange","Divya");
	     given(userService.retrieveUser()).willReturn(userlist);
	     //when    
	     UserServiceImpl userServiceImpl=new UserServiceImpl(userService);
	  
	   	
	   	
		
	   	// capture the arugument
	   	assertThat(argumentCapture.getAllValues().size(),is(2));
	   
	}
}
