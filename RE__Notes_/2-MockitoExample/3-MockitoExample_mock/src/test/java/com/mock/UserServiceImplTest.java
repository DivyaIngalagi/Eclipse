package com.mock;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.BDDMockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class UserServiceImplTest {
	
//	@Test
//	public void usingMock() {
//     UserService userService=mock(UserService.class);
//     List<String> userlist=Arrays.asList("Bhawana Bhan","Anil Bhan","Manish Bhan","Divya","Ruchita sharma","Akshay Gupta");
//    
//     when(userService.retrieveUser()).thenReturn(userlist);
//     
//     UserServiceImpl userServiceImpl=new UserServiceImpl(userService);
//     
//     List<String>  user=userServiceImpl.retrieveFilteredUser();
//     
//     
//     assertEquals(3, user.size());
//     
	
//	}
	
//	@Test
//	public void usingMock_WithEmptyList() {
//     UserService userService=mock(UserService.class);
//     List<String> userlist=Arrays.asList();
//    
//     when(userService.retrieveUser()).thenReturn(userlist);
//     
//     UserServiceImpl userServiceImpl=new UserServiceImpl(userService);
//     
//     List<String>  user=userServiceImpl.retrieveFilteredUser();
//     
//     
//     assertEquals(0, user.size());
     
	
//	}
//
//	
	@Test
	public void usingMock_BDD() {
		
		//Given
		 UserService userService=mock(UserService.class);
	     List<String> userlist=Arrays.asList("Bhawana Bhan","Anil Bhan","Manish Bhan","Divya","Ruchita sharma","Akshay Gupta");
	     given(userService.retrieveUser()).willReturn(userlist);
	     
	     UserServiceImpl userServiceImpl=new UserServiceImpl(userService);
		
		//when
		
	     List<String>  user=userServiceImpl.retrieveFilteredUser();
		//Then
	     assertThat(user.size(),is(3));
     
	
    
     
    
     
     
   
     
	
	}
	
}
