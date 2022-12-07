package P1;

import java.util.Comparator;
import java.util.List;

public class PP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=List.of("Divya","Anand","Dinehs","Gopal","Gopal");
		
		String intger=names.stream().min((x,y)->x.compareTo(y)).get();
		
		 System.out.println("min: "+intger);
		 
		 
		 String intge1r=names.stream().max(Comparator.comparing(String::valueOf)).get();
			
		 System.out.println("max: "+intge1r);
		 
		 names.stream().sorted((o1, o2) -> o1.compareTo(o2)).forEach(System.out::println);
	}

}
