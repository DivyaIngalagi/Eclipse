package com.controller;


	import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.controller.Product;

	public class SelectUser {	
		public static void main(String[] args) {
			
			int choice=0;
			do {
			Scanner scan=new Scanner(System.in);
			System.out.println("---MENU---");
			System.out.println("1.Admin\n2.User\n0.Exit");
			System.out.println("------------------");
			System.out.println("Enter your choice");
			
			choice=scan.nextInt();
			switch(choice) {
			case 1:
				int adminChoice=0;
				System.out.println("You are Admin,Please provide UserName");
				String aname=scan.next();
				System.out.println("You are Admin,Please provide Password");
				String apwd=scan.next();
				boolean avalidate=loginValidate(aname,apwd);
				if(avalidate) {
					System.out.println("------Welcome to Admin Panel------");
					do {
						Scanner ascan=new Scanner(System.in);
						System.out.println("---ADMIN MENU---");
						System.out.println("1.AddProduct\n2.UpdateProduct\n3.DeleteProduct\n4.DeleteCustomer\n5.UpdateProduct\n6.Exit");
						System.out.println("------------------");
						System.out.println("Admin Enter your choice");
						adminChoice=ascan.nextInt();
						Admin aobj=new Admin();
						if(adminChoice==1) {
							System.out.println("Available Products");
							aobj.viewProductDetails();
							System.out.println("Admin Enter the Products");
							ArrayList<Product> addproduct=new ArrayList<Product>();
							Product p=new Product();
							p.setProduct_id(1);
							p.setProduct_name("HP");
							p.setProduct_desc("It's a good Laptop");
							p.setProduct_price(7500.50);
							addproduct.add(p);
							aobj.addProductFun(addproduct);
							System.out.println("Admin 1");
							
						
						
						
						}else if(adminChoice==2) {
							Scanner uscan=new Scanner(System.in);
							String pname="";
							System.out.println("Available Products");
							ArrayList<Product>allproducts=aobj.viewProductDetails();
							System.out.println("Admin Enter the Product name to Update");
							pname=uscan.nextLine();
							aobj.updateProduct(pname);
					
							
							
					
							
							
							System.out.println("Admin 2");
						}else if(adminChoice==3) {
							Scanner uscan=new Scanner(System.in);
							String pname="";
							System.out.println("Available Products");
							ArrayList<Product>allproducts=aobj.viewProductDetails();
							System.out.println("Admin Enter the Product name to Delete");
							pname=uscan.nextLine();
							aobj.deleteProduct(pname);
							
							
							System.out.println("Admin 3");
						}else if(adminChoice==4) {
							System.out.println("Admin 4");
						}else if(adminChoice==5) {
							System.out.println("Admin 5");
						}
						else {
							System.out.println("Wrong Choice");
						}
					}while(adminChoice!=0);
				}else {
					System.out.println("Wrong Username and Password!!!");
				}
				break;
			case 2:
				System.out.println("You are User,Please provide UserName");
				String uname=scan.next();
				System.out.println("You are User,Please provide Password");
				String upwd=scan.next();
				boolean uvalidate=loginValidate(uname,upwd);
				if(uvalidate) {
					int userChoice=0;
					User u=new User();
					Scanner uscan=new Scanner(System.in);
					System.out.println("Welcome to User Panel");
					do {
						
						System.out.println("---USER MENU---");
						System.out.println("1.VIEWAllProduct\n2.PlaceOrder\n3.Exit");
						System.out.println("------------------");
						System.out.println("User Enter your choice");
						
						userChoice=uscan.nextInt();
						if(userChoice==1) {	
							User uobj=new User();
							if(userChoice==1) {	
								System.out.println("Available Products");
								uobj.viewAllProduct();
								
							
							
							}else if(userChoice==2) {
								int pchoice=0;
						do {						
							System.out.println("---MENU---");
							System.out.println("1.Mobile\n2.Laptop\n3.Furniture\n0.Exit");
							System.out.println("------------------");
							System.out.println("Enter your choice");
							
							pchoice=uscan.nextInt();
							switch(pchoice) {
							case 1:
								System.out.println("User 1");
								u.getMobile();
								break;
								
							case 2:
								System.out.println("User 2");
								u.getLaptop();
								break;
							
							case 3:
								System.out.println("User 3");
								u.getFurniture();
								break;
							
								
							}	
						}while(pchoice!=0);
						}
						else {
							System.out.println("Wrong Choice");
						}
					}
					}while(userChoice!=0);
					
				}else {
					System.out.println("Wrong Username and Password!!!");
				}
				break;
//			default:
//				System.out.println("Wrong Choice");
			}
			}while(choice!=0);
		}

		

	
	
	private static boolean loginValidate(String aname, String apwd) {
		String []acred= {"divya","1234"};
		if(aname.equals(acred[0])&&apwd.equals(acred[1])) {
			
			return true;
		}else {
			
			return false;
		}
		
	}
	}
	
	class GetProductsDetails{
		GetProductsDetails(){
			ArrayList<Product> product_list = new ArrayList<Product>();
			Product product1 = new Product();
			product1.setProduct_id(1);
			product1.setProduct_name("Lenovo X6");
			product1.setProduct_desc("It's a good Laptop");
			product1.setProduct_price(7500.50);
			
			
			Product product2 = new Product();
			product2.setProduct_id(2);
			product2.setProduct_name("Dell Vostro");
			product2.setProduct_desc("It's a good Laptop");
			product2.setProduct_price(8500.50);
			
			Product product3 = new Product(3,"Iphone 13 Pro Max","It's awesome",130000.50);
			
			product_list.add(product1);
			product_list.add(product2);
			product_list.add(product3);
			
			
			Iterator<Product> itr=product_list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			
			
		}
	}

