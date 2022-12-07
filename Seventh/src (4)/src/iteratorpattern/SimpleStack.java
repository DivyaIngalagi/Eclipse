package iteratorpattern;

import java.util.Iterator;

public class SimpleStack implements Iterable<SimpleStack>{

	@Override
	public Iterator<SimpleStack> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<SimpleStack>() {
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public SimpleStack next() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
	
	public static void main(String[] args) {
		SimpleStack stack = new SimpleStack();
		
		for (SimpleStack s : stack) {
			System.out.println(s);
		}
	}
}
