package function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/*
interface Function<T, R>{
	R apply(T);
}
*/
class Employee{
	
	int hours;
	float rate;
	
	public Employee(int hours, float rate) {
		super();
		this.hours = hours;
		this.rate = rate;
	}
	
	public double getNetIncome() {
		return hours * rate;
	}
}

public class FunctionTest {
	
	private static double totalSalary(List<Employee> sales, Function<Employee, Double> f) {
		double total = 0;
		
		for (Employee employee : sales) {
			total += f.apply(employee);
		}
		
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> sales = new ArrayList<Employee>();
		sales.add(new Employee(180, 100));
		sales.add(new Employee(190, 100));
		sales.add(new Employee(160, 100));
		sales.add(new Employee(170, 100));
		
		System.out.printf("Total salary of sales = %.2f%n", totalSalary(sales, e -> e.getNetIncome()));
	
		Function<String, String> f1 = s -> s.toLowerCase();
		Function<String, String> f2 = s -> s.substring(0, 15);
		
		System.out.println(f1.apply("LION"));
		System.out.println(f2.apply("akash.thakur@citiustech.com"));
		System.err.println(f1.andThen(f2).apply("AKASH.THAKUR@CITIUSTECH.COM"));
	}

}
