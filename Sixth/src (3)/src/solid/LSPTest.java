package solid;

class Employee{
	
	private int hours;
	private float rate;

	public Employee() {
		// TODO Auto-generated constructor stub
		this(75, 90);
	}

	public Employee(int hours, float rate) {
		this.hours = hours;
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	
	public double getNetIncome() {
		double income = hours * rate;
		int ot = hours - 180;
		if(ot > 0) income += 50 * ot;
		return income;
	}

	@Override
	public String toString() {
		return "Employee [hours=" + hours + ", rate=" + rate + "]";
	}
	
}

class SalesPerson extends Employee{
	
	private double sales;
	
	public SalesPerson() {
		// TODO Auto-generated constructor stub
		sales = 50000;
	}
	
	public SalesPerson(int hours, float rate, double sales) {
		super(hours, rate);
		this.sales = sales;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}
	
	@Override
	public double getNetIncome() {
		double income = super.getNetIncome();
		income += sales / 10;
		
		return income;
	}

	@Override
	public String toString() {
		return "SalesPerson [sales=" + sales + "]";
	}
	
}

public class LSPTest {
	
	private static double tax(Employee emp) {
		double income = emp.getNetIncome();
		double excess = income - 20000;
		return income > 20000 ? excess * 0.1  : 0;
	}
	
	private static double totalSales(Employee[] employees) {
		double total = 0;
		
		for (Employee emp : employees) {
			if (emp instanceof SalesPerson) {
				SalesPerson sp = (SalesPerson) emp;
				total += sp.getSales();
			}
		}
		
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Employee jack = new Employee(190, 100);
		 * System.out.printf("Jack's income = %.2f and tax = %.2f%n",
		 * jack.getNetIncome(), tax(jack));
		 * 
		 * Employee jill = new SalesPerson(190, 100, 100000);
		 * System.out.printf("Jill's income = %.2f and tax = %.2f%n",
		 * jill.getNetIncome(), tax(jill));
		 */
		
		Employee[] employees = new Employee[4];
		employees[0] = new Employee(190, 100);
		employees[1] = new SalesPerson(190, 100, 100000);
		employees[2] = new SalesPerson(200, 100, 250000);
		employees[3] = new Employee(210, 100);
		
		System.out.printf("Total sales = %.2f%n", totalSales(employees));
		
		Employee jack = new Employee();
		System.out.println(jack.getHours());
		Employee jill = new SalesPerson(180, 100, 200000);
		System.out.println(jill.getHours());
		//SalesPerson sp = new SalesPerson();
		SalesPerson sp = (SalesPerson) jill;
		//System.out.println(((SalesPerson) jill).getSales());
	}

}




