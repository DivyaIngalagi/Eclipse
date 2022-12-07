package streams;

import java.util.ArrayList;
import java.util.List;

class Product{
	
	int productNo;
	float price;
	int stock;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productNo, float price, int stock) {
		super();
		this.productNo = productNo;
		this.price = price;
		this.stock = stock;
	}

	@Override
	public String toString(/*Product this*/) {
		return "Product [productNo=" + this.productNo + ", price=" + price + ", stock=" + stock + "]";
	}

}

public class MinMaxTest {

	static void print(Product p) {
		System.out.println(p);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(104, 450, 40));
		products.add(new Product(102, 250, 20));
		products.add(new Product(101, 150, 10));
		products.add(new Product(103, 350, 30));
		products.add(new Product(105, 550, 50));
		//products.add(new Product(106, 550, 50));
	
//		products.stream().forEach(System.out::println);
		
		products.stream().forEach(MinMaxTest::print);
		
		System.out.println("-------------------------");
		
		Product[] productArray = products.stream().toArray(Product[]::new);
		
		for (Product product : productArray) {
			System.out.println(product);
		}
		
		System.out.println("-------------------------");
		
		Product p = products.stream().max((p1, p2) -> p1.stock - p2.stock).get();
		System.out.println(p);
	}

}
