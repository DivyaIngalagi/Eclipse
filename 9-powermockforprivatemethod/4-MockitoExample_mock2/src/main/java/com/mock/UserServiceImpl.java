package com.mock;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl {
	
	private UserService userService;

	public UserServiceImpl(UserService userService) {
		this.userService = userService;
	}
	
	public List<String> retrieveFilteredUser(String user)
	{
		List<String> filteredUser=new ArrayList<String>();
		List<String> allUser=userService.retrieveUser(user);
		System.out.println(allUser);
		for( String userlist:allUser)
		{
			if(userlist.contains("Bhan"))
			{
				filteredUser.add(userlist);
			}
		}
		return filteredUser;
		
	
	}
	
	public void DeleteNotRelatedUser(String user)
	{
		List<String> allUser=userService.retrieveUser(user);
		
		for( String notauser:allUser)
		{
			if(!notauser.contains("Bhan"))
			{
				userService.deletUser(notauser);
			}
		}
		
	
	}
	
}
