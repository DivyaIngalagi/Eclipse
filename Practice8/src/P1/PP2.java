package P1;

import java.util.ArrayList;
import java.util.Collections;

public class PP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(122);
		marks.add(20);
		marks.add(30);
		System.out. println(marks);
		Collections.sort(marks);
		System.out. println(marks);//ascending order
		
		for(Integer in:marks) {
			System.out. println(in);
		}//ascending order display
		
		
		//IfObject has properties so we use comparator or comparable to tell in which  order we want to sort
		
		ArrayList<Employee> marks1=new ArrayList<Employee>();
		marks1.add(new Employee(106, "Divya", "23232"));
		marks1.add(new Employee(102, "Anand", "232322"));
		marks1.add(new Employee(103, "Sunita", "2323222"));
		System.out. println(marks1);
//		Collections.sort(marks1);//error
//		System.out. println(marks1);//ascending order
		
		//comparator when we want to sort on the basis of multiple logic
		//comparable when want to sort according to single logic
//		Collections.sort(marks1);//error
//		System.out.println(marks1);
//
//		for(Employee in:marks1) {
//			System.out. println(in);
//		}//ascending order display
		
		System.out.println();
		
		Collections.sort(marks1,new NameComparator());//error
		System.out.println(marks1);

		for(Employee in:marks1) {
			System.out. println(in);
		}//ascending order display
		
		System.out.println();
		
		Collections.sort(marks1,new IdComparator());//error
		System.out.println(marks1);

		for(Employee in:marks1) {
			System.out. println(in);
		}//ascending order display
	}

}
