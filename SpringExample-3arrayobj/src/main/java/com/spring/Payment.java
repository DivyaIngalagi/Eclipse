package com.spring;

public class Payment {

	private int payedAmount;
	private String paymentDetail;

	public Payment() {
		System.out.println("P Default constructors");
	}

	public Payment(int payedAmount, String paymentDetail) {
		System.out.println("P Parameterized constructors");
		this.payedAmount = payedAmount;
		this.paymentDetail = paymentDetail;
	}

	public int getPayedAmount() {
		System.out.println("get PA");
		return payedAmount;
	}

	public void setPayedAmount(int payedAmount) {
		System.out.println("set PA");
		this.payedAmount = payedAmount;
	}

	public String getPaymentDetail() {
		System.out.println("get PD");
		return paymentDetail;
	}

	public void setPaymentDetail(String paymentDetail) {
		System.out.println("get PD");
		this.paymentDetail = paymentDetail;
	}

	@Override
	public String toString() {
		return "Payment [payedAmount=" + payedAmount + ", paymentDetail=" + paymentDetail + "]";
	}

}
