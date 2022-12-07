package com.spring;

public class Payment {

	private int payedAmount;
	private String paymentDetail;

	public Payment() {
	}

	public Payment(int payedAmount, String paymentDetail) {
		this.payedAmount = payedAmount;
		this.paymentDetail = paymentDetail;
	}

	public int getPayedAmount() {
		return payedAmount;
	}

	public void setPayedAmount(int payedAmount) {
		this.payedAmount = payedAmount;
	}

	public String getPaymentDetail() {
		return paymentDetail;
	}

	public void setPaymentDetail(String paymentDetail) {
		this.paymentDetail = paymentDetail;
	}

	@Override
	public String toString() {
		return "Payment [payedAmount=" + payedAmount + ", paymentDetail=" + paymentDetail + "]";
	}

}
