package ispbank;

public class BankISPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account[] accounts = new Account[4];
		accounts[0] = new CurrentAccount();
		accounts[0].deposit(5000);
		accounts[1] = new SavingsAccount();
		accounts[1].deposit(5000);
		accounts[2] = new SavingsAccount();
		accounts[2].deposit(27000);
		accounts[3] = new CurrentAccount();
		accounts[3].deposit(27000);
		
		for (Account acc : accounts) {
			System.out.printf("%d\t%.2f%n", acc.getId(), acc.getBalance());
		}
	}

}
