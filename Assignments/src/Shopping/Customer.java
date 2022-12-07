package Shopping;

public  class Customer implements Comparable<Customer> {
	
	private  String id;
	private  double purchase;
	private  int rating;
	
	

	
	
	public String getId() {
		return id;
	}


	public double getPurchase() {
		return purchase;
	}


	public int getRating() {
		return rating;
	}


	public Customer(String id, double purchase, int rating) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.purchase=purchase;
		this.rating=rating;
	}


	@Override
	public int compareTo(Customer c) {
		// TODO Auto-generated method stub
		return this.id.compareTo(c.id);
	}


	@Override
	public String toString() {
		return id+" "+purchase+" "+rating;
	}
	
	
}
