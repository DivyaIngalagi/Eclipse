package com.mock;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import org.mockito.junit.jupiter.MockitoExtension;

@RunWith(org.mockito.junit.MockitoJUnitRunner.class)
//@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {
	
//	@Rule
//	public MockitoRule mockitoRule=MockitoJUnit.rule();
	
	@Mock 
	UserService userService;
	
   @InjectMocks
   UserServiceImpl userServiceImpl;
   
  // @Captor
 //  ArgumentCaptor<String> argumentCapture;
   
//   @BeforeEach
//   public  void createMocks() {
//     MockitoAnnotations.initMocks(this);
//   }
	
	
	  @Test public void usingMock() { List<String>
	  userlist=Arrays.asList("Bhawana Bhan","Anil Bhan","Manish Bhan"
	  ,"Divya","Ruchita sharma","Akshay Gupta");
	  when(userService.retrieveUser("Bhan")).thenReturn(userlist); List<String>
	  user=userServiceImpl.retrieveFilteredUser("Bhan"); assertEquals(3,
	  user.size());
	
	 }
	 /* 
	 * @Test public void usingMock_WithEmptyList() { List<String>
	 * userlist=Arrays.asList();
	 * when(userService.retrieveUser("Bhan")).thenReturn(userlist);
	 * 
	 * List<String> user=userServiceImpl.retrieveFilteredUser("Dummy");
	 * 
	 * assertEquals(0, user.size());
	 * 
	 * 
	 * }
	 * 
	 * 
	 * @Test public void usingMock_BDD() {
	 * 
	 * //Given List<String>
	 * userlist=Arrays.asList("Bhawana Bhan","Anil Bhan","Manish Bhan"
	 * ,"Divya","Ruchita sharma","Akshay Gupta");
	 * given(userService.retrieveUser("Bhan")).willReturn(userlist);
	 * 
	 * //when
	 * 
	 * List<String> user=userServiceImpl.retrieveFilteredUser("Bhan"); //Then
	 * assertThat(user.size(),is(3)); }
	 */
	
//	  @Test public void testDeleteNotRelatedUser() {
////	  
//////	  Given // 
//		  UserService userService=mock(UserService.class);
////		 
//	  List<String> userlist = Arrays.asList("Bhawana Bhan","Anil Bhan","Manish Bhan","orange","Divya"); 
//	  when(userService.retrieveUser("Bhan")).thenReturn(userlist); 
//	  
//	  UserServiceImpl userServiceImpl=new UserServiceImpl(userService); //when
//	  userServiceImpl.DeleteNotRelatedUser("Divya");
//	 
////	  //Then // verify(userService, times(1)).deletUser("Divya");
////	  //verify(userService,atLeastOnce()).deletUser("Divya");
////	  //verify(userService,never()).deletUser("Divya");
////	  
//	  then(userService).should().deletUser("orange");
////	  then(userService).should(never()).deletUser("Bhan");
////	 
//	  }
	 
	
   
   // check again and do it again
   
	@Test
	public void testDeleteNotRelatedUser_usingArgument() {
		
		//Given
		// define Argument Capture
		ArgumentCaptor<String> argumentCapture=ArgumentCaptor.forClass(String.class);
		 UserService userService=mock(UserService.class);
	     List<String> userlist=Arrays.asList("Bhawana Bhan","Anil Bhan","orange","Divya");
	     given(userService.retrieveUser("Bhan")).willReturn(userlist);
	     //when
	     UserServiceImpl userServiceImpl=new UserServiceImpl(userService);
	   	userServiceImpl.DeleteNotRelatedUser("dummy");
	   	
	   	//Then
	   	// define the Argument capturor on specfic method
	   	then(userService).should(times(1)).deletUser(argumentCapture.capture());
	    // then(userService).should(never()).deletUser("Bhan");
		
	   	// capture the arugument
	   	assertThat(argumentCapture.getAllValues().size(),is(2));
	   
	}
}
