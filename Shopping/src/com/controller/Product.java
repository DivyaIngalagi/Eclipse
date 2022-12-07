package com.controller;


//bean class -- POJO --- Entity Class
public class Product {
	private int product_id;
	private String product_name;
	private String product_desc;
	private double product_price;
	private String product_cat;
	public String getProduct_cat() {
		return product_cat;
	}
	public void setProduct_cat(String product_cat) {
		this.product_cat = product_cat;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_desc() {
		return product_desc;
	}
	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	public Product(int product_id, String product_name, String product_desc, double product_price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_desc = product_desc;
		this.product_price = product_price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_desc=" + product_desc
				+ ", product_price=" + product_price + "]";
	}
	
	

}
