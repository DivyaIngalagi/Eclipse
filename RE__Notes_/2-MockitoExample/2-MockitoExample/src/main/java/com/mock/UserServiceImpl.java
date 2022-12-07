package com.mock;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl {
	
	private UserService userService;

	public UserServiceImpl(UserService userService) {
		this.userService = userService;
	}
	
	public List<String> retrieveFilteredUser()
	{
		List<String> filteredUser=new ArrayList<String>();
		List<String> allUser=userService.retrieveUser();
		
		for( String userlist:allUser)
		{
			if(userlist.contains("Bhan"))
			{
				filteredUser.add(userlist);
			}
		}
		return filteredUser;
		
	
	}
	

	
}
