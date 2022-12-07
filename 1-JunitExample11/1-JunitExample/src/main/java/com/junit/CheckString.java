package com.junit;


public class CheckString {
	
	
	//AACD -->CD   CDAA -->CDAA  ACDB-->CDB
	
	public String TruncateAtFirstAnd2Position(String str)
	{
		
		if(str.length()<=2)
			
			return str.replaceAll("A","");
		
		String first2char=str.substring(0,2);
		String stringminusFirst2Char= str.substring(2);
		
		return first2char.replaceAll("A", "")+ stringminusFirst2Char;
		
	}

}
