package ispbank;

abstract public class Account {

	private int id;
	protected double balance;
	
	private static int nextId;
	
	static {
		nextId = (int)( System.currentTimeMillis() % 1000000); 
	}
	
	public Account() {
		// TODO Auto-generated constructor stub
		id = ++nextId;
	}
	
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}

	public abstract void withdraw(double amount);
	public abstract void deposit(double amount);
}








