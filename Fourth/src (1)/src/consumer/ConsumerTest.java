package consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/*
 * interface Consumer<T>{
 * 	void accept(T value);
 * }
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

	@Override
	public String toString() {
		return "Employee [hours=" + hours + ", rate=" + rate + "]";
	}
	
}

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> sales = new ArrayList<Employee>();
		sales.add(new Employee(180, 100));
		sales.add(new Employee(190, 100));
		sales.add(new Employee(160, 100));
		sales.add(new Employee(200, 100));
		
		Consumer<Integer> ci = n -> System.err.println(n * n);
		ci.accept(7);
		
		for (Employee employee : sales) {
			if(employee.hours > 180) {
				double increment = employee.getNetIncome() + 1000;
				System.out.println(increment);
			}
		}
		
		System.out.println("-----------------------");
		Predicate<Employee> p = e -> e.hours > 180;
		Function<Employee, Double> f = e -> e.getNetIncome() + 1000;
		Consumer<Double> c = i -> System.out.println(i);
		
		for (Employee employee : sales) {
			if(p.test(employee)) {
				double increment = f.apply(employee);
				c.accept(increment);
			}
		}
	}

}




