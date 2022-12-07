package functionalprogramming;

import java.util.List;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		int total = 0;
		for (Integer n : numbers) {
			if(n % 2 == 0) {
				total += n * 2;
			}
		}
		System.out.println(total);
		*/
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(numbers.stream()
								  .filter(n -> n % 2 == 0)
								  .mapToInt(e -> e  * 2)
								  .sum()
				);
	}

}




