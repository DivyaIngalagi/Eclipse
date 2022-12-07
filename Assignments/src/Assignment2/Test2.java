package Assignment2;

import java.io.ObjectInput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Assignment1.Product;

interface Filter{
	boolean allowed(Product p,Object input);
}
//interface Filter{
//	boolean checkGreaterThanStock(int stock,Product p);
////	boolean checkGreaterThanPrice(float price,Product p);
//}
//
//interface Filter1{
//boolean checkGreaterThanPrice(float price,Product p);
//}

class ProductFilter{
	
	static void printProduct(List<Product> product_list,Filter f,Object input  ) {
		for(Product p:product_list) {
			if(f.allowed(p,input)) {
				System.out.println(p);
			}
		}
	}
	
//	static void printProductPricewise(List<Product> product_list,Filter1 f,float price) {
//		for(Product p:product_list) {
//			if(f.checkGreaterThanPrice(price, p)) {
//				System.out.println(p);
//			}
//		}
//	}
	
}
public class Test2 {
//	static int no=5;
	private static boolean greaterThanStock(Product p,Object input) {
		return p.getStock()>(Integer)input;
	}
	
	private static boolean greaterThanPrice(Product p,Object input) {
		return p.getPrice()>(Float)input;
	}
	
	public static void main(String[] args) {
		

		
		ArrayList<Product> product_list = new ArrayList<Product>();
		
		Product prod=new Product();
		prod.setProductNo(101);
		prod.setPrice(100);
		prod.setStock(1);
		
		Product prod1=new Product();
		prod1.setProductNo(102);
		prod1.setPrice(1000);
		prod1.setStock(2);
		
		product_list.add(prod);
		product_list.add(prod1);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter stock ");
		int stock=scan.nextInt();
		ProductFilter.printProduct(product_list,Test2::greaterThanStock,stock);
		
		System.out.println("Enter price ");
		float price =scan.nextFloat();
		ProductFilter.printProduct(product_list,Test2::greaterThanPrice,price);
	}

}
