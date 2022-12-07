package com.mock;

import java.util.List;

public interface UserService {
	
	public List<String> retrieveUser(String user);

	public void deletUser(String user);

}
