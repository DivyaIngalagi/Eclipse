package com.junittest;

public class StringReverse {
	
	public String checkStringReverse(String name) {
		
		 String str = new String(name);
	      StringBuffer sb = new StringBuffer(str);
	      String str2 = sb.reverse().toString();
		return str2;
	}
}
