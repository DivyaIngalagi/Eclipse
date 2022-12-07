package divya.com;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Stream<String> stream = Stream.of("10","20","30","40").parallel();  
		  IntStream ins = stream.mapToInt(s -> Integer.parseInt(s));
		  System.out.println(ins.isParallel());
	}

}
