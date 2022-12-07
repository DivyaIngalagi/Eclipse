package com.controller;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arrayex {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();//Creating arraylist 
		list.add(100);
		list.add(200);
		
		ListIterator<Integer>itr=list.listIterator();
		System.out.println(itr.nextIndex());
		System.out.println(itr.hasNext());
		System.out.println(itr.nextIndex());
		System.out.println(itr.next());
		System.out.println(itr.nextIndex());
		System.out.println(itr.next());
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
	}

}
