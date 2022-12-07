package com.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("obj")
public class Customer {
	
	//lateral dependency
	private int custId;
	private String custName;
	
	
	//Object Dependency
	
	
	
	
	

	
	


	public Customer() {

		System.out.println("Object Created");
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
		return "Customer [custId=" + custId + ", custName=" + custName + "]";
	}




	

}





//ya tho component lago os no error agar nahi laya tho bean definition do java configuration file mai