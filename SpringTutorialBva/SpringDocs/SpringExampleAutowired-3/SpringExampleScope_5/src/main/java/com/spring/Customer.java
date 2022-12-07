package com.spring;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Customer implements DisposableBean, InitializingBean{
	
	//lateral dependency
	private int custId;
	private String custName;
	
	


	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		System.out.println("hellosetter");
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
		return "Customer [custId=" + custId + ", custName=" + custName +  "]";
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("After property Set");
		
	}
	public void destroy() throws Exception {
		System.out.println("Custom Destroy Method");
	}




	

}
