package ispbank;

public class SavingsAccount extends Account{

	final static double MIN_BALANCE = 10000;
	
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
		balance += MIN_BALANCE;
	}
	
	public void withdraw(double amount) throws InsufficientFundsException {
		if(balance - amount > MIN_BALANCE) {
			balance -= amount;
		}else {
			throw new InsufficientFundsException();
		}
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
}



