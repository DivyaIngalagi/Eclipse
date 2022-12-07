package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> iList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> pList = new ArrayList<Integer>();
		
		for(Integer value : iList) {
			if(value % 2 == 0) {
				pList.add(value * 2);
			}
		}
		System.out.println(pList);
		
		System.out.println(iList.stream()
								.filter(n -> n % 2 == 0)
								.map(n -> n * 2)
								.collect(Collectors.toList()));
	}

}


