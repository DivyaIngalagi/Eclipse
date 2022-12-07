package com.controller;

public class Person{
	
	int pid;
	String pname;
	int i=0;
	
	public void eat() {
		System.out.println("Person eat thrice a day");
	}

	public Person() {
		System.out.println("Hello Default Constructor");
	}
	
	public Person(int id,String name) {
		this.pid=id;
		this.pname=name;
	}
	
	public static void display() {
		Person p=new Person();
		System.out.println(p.i);
	}
}