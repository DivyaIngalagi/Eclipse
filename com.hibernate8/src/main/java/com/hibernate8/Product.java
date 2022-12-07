package com.hibernate8;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;



@Entity
@Table(name="Product")
@DiscriminatorColumn(name="ProductType",discriminatorType = DiscriminatorType.STRING)
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int prodId;
	
	@Column(name="Prod_Name")
	String prodName;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	
}
