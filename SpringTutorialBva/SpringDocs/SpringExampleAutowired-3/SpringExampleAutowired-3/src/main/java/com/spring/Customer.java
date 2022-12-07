package com.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
	
	//lateral dependency
	private int custId;
	private String custName;
	
	
	//Object Dependency
	
//	
//	@Autowired
//	@Qualifier("pay2")
	Payment payment;
	
	
	

//	@Autowired
//	public Customer(int custId, String custName, @Qualifier(value = "pay2") Payment payment) {
//		this.custId = custId;
//		this.custName = custName;
//		this.payment = payment;
//	}
	

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

//	@Autowired
//	@Qualifier("pay2")
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










//@Autowired
//@Qualifier("pay2")//by default is property injection and we use it bcoz we want which instance definition we wNT TO use