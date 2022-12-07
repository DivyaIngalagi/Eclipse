package com.spring;

public class ContactDetails {

	String contactAddress;

	public ContactDetails() {
	}

	public ContactDetails(String contactAddress) {
		super();
		this.contactAddress = contactAddress;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	@Override
	public String toString() {
		return "ContactDetails [contactAddress=" + contactAddress + "]";
	}
	
}
