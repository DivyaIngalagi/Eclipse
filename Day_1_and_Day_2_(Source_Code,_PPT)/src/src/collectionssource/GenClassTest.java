package collectionssource;

class IndexedValue<V>{ //1, "Monday"
	
	private int index;
	private V value;
	
	public IndexedValue(V value) {
		index = 1;
		this.value = value;
	}
	
	public int getIndex() {
		return index;
	}
	
	public V getValue() {
		return value;
	}
}

public class GenClassTest {
	
	private static void print(IndexedValue<?> iv) {
		System.out.printf("%d\t%s%n", iv.getIndex(), iv.getValue());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		double b = a;
		IndexedValue<Double> dv = new IndexedValue<>(12.40);
		IndexedValue<Integer> iv = new IndexedValue<Integer>(7);
		IndexedValue<String> sv = new IndexedValue<>("Jack");
		print(iv);
		print(dv);
		print(sv);
	}

}




	
	