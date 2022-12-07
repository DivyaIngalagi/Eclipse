package Assignment4;

import java.util.ArrayList;
import java.util.function.Predicate;

public class NameSpaceCount {

	
	public static void printIf(String message, Predicate<Character> check) {
		int countspace=0;
		for(int i=0;i<message.length();i++) {
			if(check.test(message.charAt(i))) {	
				countspace++;
			}
		}
				System.out.println(countspace);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="Hello Hi !!";
		
		Predicate<Character>message= ms ->ms==' ';
		
		
		printIf(msg,message);
	}

}















/*int countspace=0;
for(int i=0;i<msg.length();i++) {
	if(msg.charAt(i)==' ') {
		countspace++;
	}
}
System.out.println(countspace);
*/