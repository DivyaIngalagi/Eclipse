package com.controller;

import java.util.ArrayList;
import java.util.Iterator;



public class MyMainShopping {

	public static void main(String[] args) {
		GetProducts obj = new GetProducts();

	}

}
class GetProducts{
	GetProducts(){
		ArrayList<Product> product_list = new ArrayList<Product>();
		Product product1 = new Product();
		product1.setProduct_id(1);
		product1.setProduct_name("Lenovo X6");
		product1.setProduct_desc("It's a good Laptop");
		product1.setProduct_price(7500.50);
		
		
		Product product2 = new Product();
		product2.setProduct_id(2);
		product2.setProduct_name("Dell Vostro");
		product2.setProduct_desc("It's a good Laptop");
		product2.setProduct_price(8500.50);
		
		Product product3 = new Product(3,"Iphone 13 Pro Max","It's awesome",130000.50);
		
		product_list.add(product1);
		product_list.add(product2);
		product_list.add(product3);
		
		
		Iterator<Product> itr=product_list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}
}