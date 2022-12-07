package com.controller;

class Mymain{
	public static void main(String args[]) {
	Person p=new Person();
			p.pid=101;
			p.pname="Divya";
			p.eat();
//			p.Person();
			System.out.println(p.pid+"-"+p.pname);
			
			Person p1=new Person(101,"Aanand");
					System.out.println(p1.pid+"-"+p1.pname);
					
	}
	
}