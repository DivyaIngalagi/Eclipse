package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> iList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> evenList = new ArrayList<Integer>();
		
		for (Integer value : iList) {
			if(value % 2 == 0)
				evenList.add(value);
		}
		System.out.println(evenList);
		
		System.out.println(iList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()));
	}

}



