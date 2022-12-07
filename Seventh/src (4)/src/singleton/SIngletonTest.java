package singleton;

class Banker{
	
	private static Banker singleton = null;
	
	private Banker() {}
	
	public static Banker getBanker() {
		if(singleton == null) {
			singleton = new Banker();
		}
		return singleton;
	}
}

public class SIngletonTest {

	public static void main(String[] args) {
		Banker b1 = Banker.getBanker();
		Banker b2 = Banker.getBanker();
		
		System.out.println(b1);
		System.out.println(b2);
	}
}
