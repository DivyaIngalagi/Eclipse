package com.hibernate8;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Mobile_ChildClass")
public class Mobile extends Product {

	String mobBrand;
	
	int ramSize;
	
	public String getMobBrand() {
		return mobBrand;
	}
	public void setMobBrand(String mobBrand) {
		this.mobBrand = mobBrand;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	
	
	
}
