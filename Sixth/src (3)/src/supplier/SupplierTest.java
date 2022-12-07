package supplier;

import java.util.Date;
import java.util.function.Supplier;

/*
 * interface Supplier<R>{
 * 		R get();
 * }
 */

public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
		
		Supplier<Long> otp = () -> System.currentTimeMillis() % 1000000;
		System.out.println(otp.get());
	}

}
