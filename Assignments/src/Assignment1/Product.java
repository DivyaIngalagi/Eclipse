package Assignment1;


public class Product {
	
	private int productNo;
	private float price;
	private int stock;
	
	public double sellingPrice() {
		return price*stock;
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

	public Product(int productNo, float price, int stock) {
		super();
		this.productNo = productNo;
		this.price = price;
		this.stock = stock;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "productNo=" + productNo + ", price=" + price + ", stock=" + stock  ;
	}

}
