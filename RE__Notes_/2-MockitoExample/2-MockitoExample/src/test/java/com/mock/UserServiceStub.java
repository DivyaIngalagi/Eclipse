package com.mock;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class UserServiceStub implements UserService{

	

	@Override
	public List<String> retrieveUser() {
		return Arrays.asList("Bhawana Bhan","Anil Bhan","Manish Bhan","Divya Bhan","Ruchita sharma","Akshay Gupta");
	}

}
