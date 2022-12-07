package ispbank;

public class BankTest {
	
	private static double tax(Account acc) {
		double balance = acc.getBalance();
		double excess = balance - 100000;
		
		return balance > 100000 ? excess * 0.1 : 0;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account sacc = new SavingsAccount();
		Account cacc = new CurrentAccount();
		sacc.deposit(720000);
		cacc.deposit(50000);
		System.out.println(sacc.getBalance());
		System.out.println(cacc.getBalance());
		/*
		System.out.println("Withdrawing 65000 from savings");
		try {
			sacc.withdraw(65000);
			System.out.println(sacc.getBalance());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Lack of funds");
		}
		*/
		System.out.printf("Tax of savings account = %.2f%n", tax(sacc));
		System.out.printf("Tax of current account = %.2f%n", tax(cacc));
	}

}
