package ispbank;

//Creational Design Pattern
//Static Factory Object
public class Banker {

//	private String cityname;
	private Banker() {}
	
//	public Banker(String cityname) {
//		this.cityname=cityname;
//	}
	
	public static Account openSavingsAccount() {
		return new SavingsAccount();
	}
	
	public static Account openCurrentAccount() {
		return new CurrentAccount();
	}
	
//	public static Account openSavingsAccount() {
//		return new SavingsAccount(this.cityname);
//	}
}

