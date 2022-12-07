package Assignment3;

import java.util.ArrayList;
import java.util.function.Predicate;


public class Names {

	
	public static void printIf(ArrayList<String> name, Predicate<String> check) {
		for (String namevalue : name) {
			if(check.test(namevalue)) {							
				System.out.println(namevalue);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		ArrayList<String>names=new ArrayList<String>();
		names.add("");
		names.add(null);
		names.add("Anand");
		names.add("Jack");
		names.add("Harry");
		
		
		Predicate<String>name= nms ->nms!=null && nms!="" ;
		
		
		printIf(names,name);
		
	}

}







/*
/*for (int i = 0; i < myList.size(); i++) {

// Print all elements of List
System.out.println(myList.get(i));
}*/

/*
for (String nm : names) {
	if(nm!=null && nm!="") {				
		System.out.println(nm);
	}
}*/
