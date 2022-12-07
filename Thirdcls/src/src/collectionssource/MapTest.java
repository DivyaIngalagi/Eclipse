package collectionssource;

import java.util.HashMap;
import java.util.Map;

class Product {

	private int productNo;
	private float price;
	private int stock;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productNo, float price, int stock) {
		super();
		this.productNo = productNo;
		this.price = price;
		this.stock = stock;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", price=" + price + ", stock=" + stock + "]";
	}

}

public class MapTest {
	
	static Map<Integer, Product> store = new HashMap<Integer, Product>();

	private static void updateProduct(int productNo) {
		Product product = store.get(productNo);
		product.setPrice(700);
		store.put(productNo, product);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		store.put(101, new Product(101, 250, 10));
		store.put(102, new Product(102, 350, 20));
		store.put(103, new Product(103, 450, 30));
		store.put(104, new Product(104, 550, 40));
		store.put(105, new Product(105, 650, 50));
		
		for(Map.Entry<Integer, Product> entry : store.entrySet())
			System.out.println(entry);
		
		updateProduct(104);
		System.out.println("------------------------");
		for(Map.Entry<Integer, Product> entry : store.entrySet())
			System.out.println(entry);
		
	}

}
