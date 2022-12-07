package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Customer{
	
	String id;
	double purchase;
	int rating;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String id, double purchase, int rating) {
		super();
		this.id = id;
		this.purchase = purchase;
		this.rating = rating;
	}

	public String getId() {
		return id;
	}

	public double getPurchase() {
		return purchase;
	}

	public int getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", purchase=" + purchase + ", rating=" + rating + "]";
	}
	
}

public class OptionalTest {

	static List<Customer> customers = new ArrayList<Customer>();
	
	private static Customer findCustomerById(String id) {
		return customers.stream()
				 .filter(c -> c.getId().equals(id))
				 .findAny()
				 .orElseGet(() -> new Customer(id, 1000, 1));
				 //.get();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer("Jack", 40000, 2);
		Customer c2 = new Customer("Jill", 50000, 4);
		
		customers.add(c1);
		customers.add(c2);
		
		Optional empty = Optional.empty();
		//Optional<String> id1 = Optional.of(c2.getId());
		Optional<String> id1 = Optional.ofNullable(c2.getId());
		System.out.println(id1);
		/*
		 * if(id1.isPresent()) System.out.println(id1.get());
		 */
		//System.out.println(c1.getId().toUpperCase());
		//System.out.println(c2.getId().toUpperCase());
		
		System.out.println(id1.orElse("customer"));
		
		Customer customer = findCustomerById("John");
		System.out.println(customer);
	}

}



