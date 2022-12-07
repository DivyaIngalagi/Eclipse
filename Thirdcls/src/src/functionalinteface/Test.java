package functionalinteface;

@FunctionalInterface
interface Filter{				//Functional interface
	boolean allowed(int value);
	
	default boolean notAllowed(int value) {	//Defender methods, virtual extension methods
		return false;
	}
}

interface Person{
	
	static void hello() {
		System.out.println("Hello User");
	}
	
	void helloWithName(String name);
}

class Customer implements Person{

	@Override
	public void helloWithName(String name) {
		// TODO Auto-generated method stub
		System.out.printf("Hello %s%n", name);
	}

	/*
	public void hello() {
		System.out.println("Customer Hello Method");
	}
	*/
}

/*
@FunctionalInterface
interface Confirm extends Filter{
		
}
*/

/*
interface Confirm extends Filter{
	int process(int value);
}
*/

class Algorithm{
	
	int x;
	
	public static void printAll(int[] numbers) {
		for (int value : numbers) {
			System.out.printf("%d ", value);
		}
		System.out.println();
	}
	
	/*
	public static void printOdd(int[] numbers) {
		for (int value : numbers) {
			if(value % 2 == 1) {			//true or false
				System.out.printf("%d ", value);
			}
		}
		System.out.println();
	}
	
	public static void printEven(int[] numbers) {
		for (int value : numbers) {
			if(value % 2 == 0) {					//true or false
				System.out.printf("%d ", value);
			}
		}
		System.out.println();
	}
	*/
	
	public static void printIf(int[] numbers, Filter check) {
		for (int value : numbers) {
			if(check.allowed(value)) {							//Callback
				System.out.printf("%d ", value);
			}
		}
		System.out.println();
	}
}

class Amit implements Filter{
	
	@Override
	public boolean allowed(int value) {
		return value % 2 == 1;
	}
	
	@Override
	public boolean notAllowed(int value) {
		return true;
	}
}

class Vinay implements Filter{
	
	@Override
	public boolean allowed(int value) {
		return value % 2 == 0;
	}
}

/*
 * class SomeFilter implements Filter{
 * 
 * 		public boolean allowed(int value){
 * 				return Test::isGreatherThan5(value);
 * 		}
 * 
 * }
 */

public class Test {

	private static boolean isGreaterThan5(int value) {
		return value > 5;
	}
	
	private static boolean isLessThan4(int value) {
		return value < 4;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.printf("Divya's all numbers: ");
		Algorithm.printAll(numbers);
		
		System.out.printf("Amit's odd numbers: ");
		Algorithm.printIf(numbers, new Amit());
		
		System.out.printf("Vinay's even numbers: ");
		Algorithm.printIf(numbers, new Vinay());
		
		System.out.printf("Ajay's greater than 5 numbers: ");
		Algorithm.printIf(numbers, Test::isGreaterThan5); //new SomeFilter() //Method Reference
		
		System.out.printf("Prakash's less than 4 numbers: ");
		Algorithm.printIf(numbers, Test::isLessThan4); //new SomeFilter() //Method Reference
		
		Customer customer = new Customer();
		customer.helloWithName("Jack Mathew");
		Person.hello();
	}
}















