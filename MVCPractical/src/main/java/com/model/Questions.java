package com.model;

public class Questions {

	private int q_id;
	public int getQ_id() {
		return q_id;
	}
	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}
	private String ques;
	private String a;
	private String b;
	private String c;
	private String d;
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	private String correct;
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public String getCorrect() {
		return correct;
	}
	public void setCorrect(String correct) {
		this.correct = correct;
	}
	@Override
	public String toString() {
		return "Questions [q_id=" + q_id + ", ques=" + ques + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d
				+ ", correct=" + correct + "]";
	}
	

	
	
	
}
