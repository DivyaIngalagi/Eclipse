package com.shop.model;


//bean class -- POJO --- Entity Class
public class Product {
	private int prod_id;
	private String prod_name;
	private float prod_price;
	private String prod_cat;
	public String getProd_cat() {
		return prod_cat;
	}
	public void setProd_cat(String prod_cat) {
		this.prod_cat = prod_cat;
	}
	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public float getProd_price() {
		return prod_price;
	}
	public void setProd_price(float prod_price) {
		this.prod_price = prod_price;
	}
	public Product(int prod_id, String prod_name, float prod_price) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_price = prod_price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [prod_id=" + prod_id + ", prod_name=" + prod_name + ", prod_price=" + prod_price + ", prod_cat="
				+ prod_cat + "]";
	}
	
	

}
