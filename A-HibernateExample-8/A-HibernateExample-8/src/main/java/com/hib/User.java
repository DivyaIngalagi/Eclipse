package com.hib;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="cacheTable")

@NamedQueries({
	
	@NamedQuery(name="fetchUserById",query="from User where id=:x"),
	@NamedQuery(name="fetchUserByName",query="from User where name=:y")
})


@NamedNativeQueries({
	
	@NamedNativeQuery(name="fetchById", query="select * from cacheTable where User_id=?")
})
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="User_id",nullable = false, unique = true)
	int id;
	
	
	@Column(name="User_Name", nullable=false)
	String name;
	
	@Column(name="User_address")
	String address;
	
	@Column(name="User_Salary")
	int salary;
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}

	
	
}
