package predicate;

import java.util.function.Predicate;

/*
@FunctionalInterface
interface Filter{				//Functional interface
	boolean allowed(int value);
}
*/
class Algorithm{	
	
	public static void printIf(int[] numbers, Predicate<Integer> check) {
		for (int value : numbers) {
			if(check.test(value)) {							//Callback
				System.out.printf("%d ", value);
			}
		}
		System.out.println();
	}
}

/*
interface Predicate<T>{
	boolean test(T t);
}
*/

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//		Algorithm.printIf(numbers, n -> { n>5 } );
		/*
		Predicate<Integer> pi = n -> n % 2 == 1;
		System.out.printf("7 Is odd %s%n", pi.test(7));
		
		Predicate<Integer> p1 = n -> n > 3;
		System.out.printf("5 is greater than 3 %s%n", p1.test(5));
		*/
		Predicate<Integer> pi = n -> n > 4;
		Predicate<Integer> p1 = n -> n % 2 == 0;
		Predicate<Integer> p2 = n -> n > 6;
		System.out.print("Even numbers : ");
		//Algorithm.printIf(numbers, n -> (n % 2 == 0) && (n > 6));
		//Algorithm.printIf(numbers, p1.and(p2)); //Predicate Joining
		//Algorithm.printIf(numbers, p1.negate());
		Algorithm.printIf(numbers, pi.negate());
	}
}
 