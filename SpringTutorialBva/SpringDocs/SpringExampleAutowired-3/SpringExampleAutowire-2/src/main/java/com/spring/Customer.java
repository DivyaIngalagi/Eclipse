package com.spring;

import java.util.List;

public class Customer {
	
	//lateral dependency
	private int custId;
	private String custName;
	
	
	//Object Dependency
	Payment payment;
	
	
	


	public Customer(int custId, String custName, Payment payment) {
		this.custId = custId;
		this.custName = custName;
		this.payment = payment;
	}


	public Customer() {

		System.out.println("Object Created");
		}
	
	
	public Payment getPayment() {
		return payment;
	}


	public void setPayment(Payment payment) {
		this.payment = payment;
	}



	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}


	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", payment=" + payment + "]";
	}




	

}
