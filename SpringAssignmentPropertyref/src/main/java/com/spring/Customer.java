package com.spring;

import java.util.List;

public class Customer {
	
	//lateral dependency
	private int custId;
	private String custName;
	
	
	//Object Dependency
	Payment payment;
	
	
	
		
	




	public Customer() {

		System.out.println("Object DC Created");
		}
	
	
	public Payment getPayment() {
		System.out.println("get payment");
		return payment;
	}

	public void setPayment(Payment payment) {
		System.out.println("set payment");
		this.payment = payment;
	}

	


	public int getCustId() {
		System.out.println("getcustid");
		return custId;
	}
	public void setCustId(int custId) {
		System.out.println("setcustid");
		this.custId = custId;
	}
	public Customer(int custId, String custName) {
		super();
		System.out.println("Object PC Created");
		this.custId = custId;
		this.custName = custName;
	}

	public String getCustName() {
		System.out.println("getcustname");
		return custName;
	}
	public void setCustName(String custName) {
		System.out.println("setcustname");
		this.custName = custName;
	}


	




	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", payment=" + payment + "]";
	}

}
