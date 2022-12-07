package com.powermock;

public class Customer {

	 private String sendMsg(String message) {  
	        return message;  
	    }  
	       
	     public String publicMethodCallingPrivate(String message) {  
	         return sendMsg(message);   
	    }  
	
}
