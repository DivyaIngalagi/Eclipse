package ispbank;

//Package Protected
final class SavingsAccount extends Account implements Profitable{

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
	
	public double addInterest(int months) {
		return balance * months * MIN_RATE / 1200;
	}
}



