package Assignment5;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;






class Employee{
	
	int hours;
	String designation;
	float rate;
	
	public Employee(String designation,int hours, float rate) {
		super();
		this.designation = designation;
		this.rate = rate;
		this.hours=hours;
	}
	
	public double getNetIncome() {
		return hours * rate;
	}

	@Override
	public String toString() {
		return "Employee [hours=" + hours + ", rate=" + rate + "]";
	}
	
}


public class SalaryBonous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> sales = new ArrayList<Employee>();
		sales.add(new Employee("sales",180, 100));
		sales.add(new Employee("developer",190, 100));
		sales.add(new Employee("Tester",160, 100));
		sales.add(new Employee("Administrator",200, 100));
		

		double increment = 0;
		System.out.println("-----------------------");
		Predicate<Employee> p = (e) ->e.designation.equals("sales");
		Function<Employee, Double> f = e -> e.getNetIncome() + (e.getNetIncome()*4/100);
//		Consumer<Double> c = i -> System.out.println(i);
		Predicate<Employee> p1 = (e) ->e.designation.equals("developer");
		Function<Employee, Double> f1 = e -> e.getNetIncome() + (e.getNetIncome()*5/100);
//		Consumer<Double> c1 = i -> System.out.println(i);
		Predicate<Employee> p2 = (e) ->e.designation.equals("Tester");
		Function<Employee, Double> f2 = e -> e.getNetIncome() + (e.getNetIncome()*3/100);
//		Consumer<Double> c2 = i -> System.out.println(i);
		Predicate<Employee> p3 = (e) ->!e.designation.equals("sales")&& !e.designation.equals("developer")&& !e.designation.equals("Tester");
		Function<Employee, Double> f3 = e -> e.getNetIncome() + (e.getNetIncome()*2/100);
		Consumer<Double> c3 = i -> System.out.println(i);
		
		for (Employee employee : sales) {
			if(p.test(employee)) {
				increment = f.apply(employee);
//				c.accept(increment);
			}
			
			if(p1.test(employee)) {
				increment = f1.apply(employee);
//				c1.accept(increment);
			}
			
			if(p2.test(employee)) {
				increment = f2.apply(employee);
//				c2.accept(increment);
			}
			
			if(p3.test(employee)) {
				increment = f3.apply(employee);
//				c3.accept(increment);
			}
			c3.accept(increment);
		}
		
	}
	
}












//for (Employee employee : sales) {
//if(employee.designation.equals("sales")) {
//	double increment = employee.getNetIncome() + (employee.getNetIncome()*4/100);
//	System.out.println(increment);
//}
//
//else if(employee.designation.equals("developer")) {
//	double increment = employee.getNetIncome() + (employee.getNetIncome()*5/100);
//	System.out.println(increment);
//}
//
//else if(employee.designation.equals("Tester")) {
//	double increment = employee.getNetIncome() + (employee.getNetIncome()*3/100);
//	System.out.println(increment);
//}
//else {
//	double increment = employee.getNetIncome() + (employee.getNetIncome()*2/100);
//	System.out.println(increment);
//}
//}