package dipbank;

import ispbank.Account;
import ispbank.Banker;
import ispbank.Profitable;

public class BankISPTest {
	
	private static void payAnnualInterest(Account[] accounts) {
		for (Account acc : accounts) {
			if (acc instanceof Profitable) {
				Profitable p = (Profitable) acc;
				double i = p.addInterest(12);
				acc.deposit(i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account[] accounts = new Account[4];
		accounts[0] = Banker.openCurrentAccount();
		accounts[0].deposit(5000);
		accounts[1] = Banker.openSavingsAccount();
		accounts[1].deposit(5000);
		accounts[2] = Banker.openSavingsAccount();
		accounts[2].deposit(27000);
		accounts[3] = Banker.openCurrentAccount();
		accounts[3].deposit(27000);
		
		for (Account acc : accounts) {
			System.out.printf("%d\t%.2f%n", acc.getId(), acc.getBalance());
		}
		System.out.println("After adding interest");
		payAnnualInterest(accounts);
		for (Account acc : accounts) {
			System.out.printf("%d\t%.2f%n", acc.getId(), acc.getBalance());
		}
	}

}
