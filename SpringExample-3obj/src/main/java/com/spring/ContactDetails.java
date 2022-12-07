package com.spring;

public class ContactDetails {

	String contactAddress;

	public ContactDetails() {
		System.out.println("CD Default constructors");
	}

	public ContactDetails(String contactAddress) {
		super();
		System.out.println("CD Default constructors");
		this.contactAddress = contactAddress;
	}

	public String getContactAddress() {
		System.out.println("getcontactaddress");
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		System.out.println("setcontactaddress");
		this.contactAddress = contactAddress;
	}

	@Override
	public String toString() {
		return "ContactDetails [contactAddress=" + contactAddress + "]";
	}
	
}
