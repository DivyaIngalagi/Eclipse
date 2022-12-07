package lambdaexpression;

@FunctionalInterface
interface Filter{
	boolean allowed(int value);
}

@FunctionalInterface
interface Calculator{
	int process(int value);
}

public class LambdaTest1 {
	
	private static int square(int value) {
		return value * value;
	}
	
	private static boolean isOdd(int value) {
		return value % 2 == 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Square = %d%n", square(7));
		/*
		Calculator calc = (int value) -> {
			return value * value;
		};
		*/
		
		Calculator calc = value -> value * value;
		
		System.out.printf("Square = %d%n", calc.process(9));
		Filter checkOdd = LambdaTest1::isOdd; //Reusing the existing function
		boolean result = checkOdd.allowed(7);
		System.out.printf("Is 7 odd %s%n", result);
		
		/*
		Filter checkEven = (int value) ->  {
			return (value % 2) == 0;			//60 units
		};
		*/
		
		Filter checkEven = value -> (value & 1) == 0;		//1 unit
		System.out.printf("Is 4 even %s%n", checkEven.allowed(4));
	}
}







