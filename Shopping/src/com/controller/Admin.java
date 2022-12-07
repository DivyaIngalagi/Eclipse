package com.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Admin {

	ArrayList<Product> product_list = new ArrayList<Product>();
	
	public Admin() {
		
	}


	public ArrayList<Product> viewProductDetails() {
		
			
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
			return product_list;
			
			
			
			
			
		
	}
	
	public void addProductFun(ArrayList<Product> addproduct) {
		
		
		product_list.addAll(addproduct);
		System.out.println("The Products are:");
		Iterator<Product> itr1=product_list.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
	
	
	
	public void updateProduct(String pname) {
		
		Iterator<Product> itr=product_list.iterator();
		while(itr.hasNext()) {
			Product product = (Product) itr.next();
			if(product.getProduct_name().equals(pname)) {
				product.setProduct_price(50000000.00);
			}
			
		}
			
		System.out.println("The Updated Products are:");
		Iterator<Product> itr1=product_list.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		

	}
	
	public void deleteProduct(String pname) {

		Iterator<Product> itr=product_list.iterator();
		while(itr.hasNext()) {
			Product product = (Product) itr.next();
			if(product.getProduct_name().equals(pname)) {
					itr.remove();
			}
			
		}
			
		System.out.println("The Available Products are:");
		Iterator<Product> itr1=product_list.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		
		
	}

	public void deleteCustomer() {
	
	}

	public void updateCustomer() {
	
	}

}

















//String[][]
//public void addProductFun(String[][] addProduct) {
//	addProducts=new String[addProduct.length][];
//	for(int i=0;i<addProduct.length;i++) {
//		addProducts[i]=new String[addProduct[i].length];
//		for(int j=0;j<addProduct[i].length;j++) {
//	addProducts[i][j]=addProduct[i][j];		
//		}
//	}
	
//	return addProducts;
//	for(int i=0;i<addProducts.length;i++) {			
//		for(int j=0;j<addProducts[i].length;j++) {
//		System.out.print(addProducts[i][j]+" ");
//	}
//		System.out.println();
//	}
//}