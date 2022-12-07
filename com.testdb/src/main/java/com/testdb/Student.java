package com.testdb;

public class Student {

	private int sid;
	private String sname;
	private String sphone;
	private String scity;
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sphone=" + sphone + ", scity=" + scity + "]";
	}
	public int getSid() {
		return sid;
	}
	@Override
	public int hashCode() {
		
		return this.sid;
	}
	@Override
	public boolean equals(Object obj) {
		
		Student st = (Student) obj;
		
		return (this.sid==st.sid && this.sname.equals(st.sname) && this.sphone.equals(st.sphone) && this.scity.equals(st.scity));
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSphone() {
		return sphone;
	}
	public void setSphone(String sphone) {
		this.sphone = sphone;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	public Student(int sid, String sname, String sphone, String scity) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sphone = sphone;
		this.scity = scity;
	}
	public Student(String sname, String sphone, String scity) {
		super();
		this.sname = sname;
		this.sphone = sphone;
		this.scity = scity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
