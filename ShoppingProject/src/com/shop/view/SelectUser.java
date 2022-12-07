package com.shop.view;


	import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.shop.dao.ProductDisplay;
import com.shop.model.Admin;
import com.shop.model.Product;
import com.shop.model.User;




	public class SelectUser {	
		@SuppressWarnings({ "static-access", "resource" })
		public static void main(String[] args) throws SQLException, ClassNotFoundException {
			
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
				ProductDisplay aobj=new ProductDisplay();
				if(avalidate) {
					System.out.println("------Welcome to Admin Panel------");
					do {
						Scanner ascan=new Scanner(System.in);
						System.out.println("---ADMIN MENU---");
						System.out.println("1.AddProduct\n2.UpdateProduct\n3.DeleteProduct\n0.Exit");
						System.out.println("------------------");
						System.out.println("Admin Enter your choice");
						adminChoice=ascan.nextInt();
						ProductDisplay availableobj=new ProductDisplay();
						if(adminChoice==1) {
							System.out.println("Available Products");
							List<Product>list=availableobj.getAllProducts();
							Iterator<Product> itr=list.iterator();
							while(itr.hasNext()) {
								System.out.println(itr.next());
							}
							
							System.out.println("Enter New Product Details");
							System.out.println("Enter ProductID:");
							int pID = ascan.nextInt();
							System.out.println("Enter ProductCategory:");
							String pctg=ascan.next();
							System.out.println("Enter ProductPrice:");
							float poprice=ascan.nextFloat();
							System.out.println("Enter ProductName:");
							ProductNameException obj = new ProductNameException();
							String pname=ascan.next();
							int psize=pname.length();
							try {
								obj.checkProductNameSize(psize);
								aobj.insertProductBypID(pID,pname,pctg,poprice);
								System.out.println("Product Inserted Successfully");
							} catch (ProductNameException e) {
								
								System.out.println(e.getMessage());
							}finally {
								System.out.println("Product Inserted Unsuccessfully!!!!Kindly Perform Again");
							}
							
							
						}else if(adminChoice==2) {
							Scanner uscan=new Scanner(System.in);
							int achoice=0;
							do {						
								System.out.println("---MENU---");
								System.out.println("1.Mobile\n2.Laptop\n3.Furniture\n0.Exit");
								System.out.println("------------------");
								System.out.println("Select Product to Update");
								
								achoice=ascan.nextInt();
								switch(achoice) {
								case 1:
									int pID=0;
									System.out.println("Products are:");
									String Desc="Mobile";
									List<Product>list1=aobj.getDescByCategory(Desc);
									Iterator<Product> itr1=list1.iterator();
									while(itr1.hasNext()) {
										System.out.println(itr1.next());
									}
									System.out.println("Enter Product Details to Update");
									System.out.println("Enter ProductID to Update:");
									pID=uscan.nextInt();
									uscan.nextLine();
									System.out.println("Enter ProductCategory to Update:");
									String pctg=uscan.nextLine();
									System.out.println("Enter ProductPrice to Update:");
									float poprice=uscan.nextFloat();
								
									
									System.out.println("Enter ProductName to Update:");
									String pname=uscan.next();
									aobj.updateProductBypID(pID,pname,pctg,poprice);
									System.out.println("Product Updated Successfully");
									break;
									
								case 2:
									int lID=0;
									System.out.println("Products are:");
									String lDesc="Laptop";
									List<Product>listLaptop=aobj.getDescByCategory(lDesc);
									Iterator<Product> itrL=listLaptop.iterator();
									while(itrL.hasNext()) {
										System.out.println(itrL.next());
									}

									System.out.println("Enter Product Details to Update");
									System.out.println("Enter ProductID to Update:");
									lID=uscan.nextInt();
									uscan.nextLine();
									System.out.println("Enter ProductCategory to Update:");
									String plctg=uscan.nextLine();
									System.out.println("Enter ProductPrice to Update:");
									float plprice=uscan.nextFloat();
//										
									System.out.println("Enter ProductName to Update:");
									String plname=uscan.nextLine();
									aobj.updateProductBypID(lID,plname,plctg,plprice);
									System.out.println("Product Updated Successfully");
									break;
								
								case 3:
									int fID=0;
									System.out.println("Products are:");
									String fDesc="Furniture";
									List<Product>listFurniture=aobj.getDescByCategory(fDesc);
									Iterator<Product> itrF=listFurniture.iterator();
									while(itrF.hasNext()) {
										System.out.println(itrF.next());
									}
									System.out.println("Enter Product Details to Update");
									System.out.println("Enter ProductID to Update:");
									fID=uscan.nextInt();
									uscan.nextLine();
									System.out.println("Enter ProductCategory to Update:");
									String pfctg=uscan.next();
									System.out.println("Enter ProductPrice to Update:");
									float pfprice=uscan.nextFloat();
//									
									System.out.println("Enter ProductName to Update:");
									String pfname=uscan.nextLine();
									aobj.updateProductBypID(fID,pfname,pfctg,pfprice);
									System.out.println("Product Updated Successfully");
									break;
								
									
								}	
							}while(achoice!=0);
					
	
						}else if(adminChoice==3) {
							
							
							Scanner uscan=new Scanner(System.in);
							int achoice=0;
							do {						
								System.out.println("---MENU---");
								System.out.println("1.Mobile\n2.Laptop\n3.Furniture\n0.Exit");
								System.out.println("------------------");
								System.out.println("Select Product to Delete");
								
								achoice=ascan.nextInt();
								switch(achoice) {
								case 1:
									int pID=0;
									float totalPrice = 0;
									System.out.println("Products are:");
									String Desc="Mobile";
									List<Product>list1=aobj.getDescByCategory(Desc);
									Iterator<Product> itr1=list1.iterator();
									while(itr1.hasNext()) {
										System.out.println(itr1.next());
									}
									System.out.println("Enter ProductID to Delete");
									pID=uscan.nextInt();
	
									
									aobj.deleteProductBypID(pID);
									
									System.out.println("Product Deleted Successfully");
									break;
									
								case 2:
									int lID=0;
									float totalPriceL = 0;
									System.out.println("Products are:");
									String lDesc="Laptop";
									List<Product>listLaptop=aobj.getDescByCategory(lDesc);
									Iterator<Product> itrL=listLaptop.iterator();
									while(itrL.hasNext()) {
										System.out.println(itrL.next());
									}
									System.out.println("Enter ProductID to Delete");
									pID=uscan.nextInt();
	
									
									aobj.deleteProductBypID(pID);
									
									System.out.println("Product Deleted Successfully");
									break;
								
								case 3:
									int fID=0;
									float totalPriceF = 0;
									System.out.println("Products are:");
									String fDesc="Furniture";
									List<Product>listFurniture=aobj.getDescByCategory(fDesc);
									Iterator<Product> itrF=listFurniture.iterator();
									while(itrF.hasNext()) {
										System.out.println(itrF.next());
									}
									System.out.println("Enter ProductID to Delete");
									pID=uscan.nextInt();
	
									
									aobj.deleteProductBypID(pID);
									
									System.out.println("Product Deleted Successfully");
									break;
								
									
								}	
							}while(achoice!=0);
					
							
							
						}else {
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
					ProductDisplay uobj=new ProductDisplay();
					System.out.println("Welcome to User Panel");
					do {
						
						System.out.println("---USER MENU---");
						System.out.println("1.VIEWAllProduct\n2.PlaceOrder\n0.Exit");
						System.out.println("------------------");
						System.out.println("User Enter your choice");

							userChoice=uscan.nextInt();
							if(userChoice==1) {
								
								System.out.println("Available Products");
								List<Product>list=uobj.getAllProducts();
								Iterator<Product> itr1=list.iterator();
								while(itr1.hasNext()) {
									System.out.println(itr1.next());
								}
							
							
							}
							else if(userChoice==2) {
								int pchoice=0;
						do {						
							System.out.println("---MENU---");
							System.out.println("1.Mobile\n2.Laptop\n3.Furniture\n0.Exit");
							System.out.println("------------------");
							System.out.println("Enter Product you want to Purchase from Product Category");
							
							pchoice=uscan.nextInt();
							switch(pchoice) {
							case 1:
								int pID=0;
								float totalPrice = 0;
								System.out.println("Products are:");
								String Desc="Mobile";
								List<Product>list=uobj.getDescByCategory(Desc);
								Iterator<Product> itr1=list.iterator();
								while(itr1.hasNext()) {
									System.out.println(itr1.next());
								}
								System.out.println("Enter ProductID you want to Purchase");
								pID=uscan.nextInt();
								List<Product>list1=uobj.getDesc(pID);
								for(int i=0;i<list1.size();i++) {
								System.out.println("Enter Quantity to purchase:");
								int qty=uscan.nextInt();
								totalPrice=qty*list1.get(i).getProd_price();
								}
								System.out.println("Total Balance:"+totalPrice);
								break;
								
							case 2:
								int lID=0;
								float totalPriceL = 0;
								System.out.println("Products are:");
								String lDesc="Laptop";
								List<Product>listLaptop=uobj.getDescByCategory(lDesc);
								Iterator<Product> itrL=listLaptop.iterator();
								while(itrL.hasNext()) {
									System.out.println(itrL.next());
								}
								System.out.println("Enter ProductID you want to Purchase");
								lID=uscan.nextInt();
								List<Product>listLaptop1=uobj.getDesc(lID);
								for(int i=0;i<listLaptop1.size();i++) {
								System.out.println("Enter Quantity to purchase:");
								int qtyL=uscan.nextInt();
								totalPriceL=qtyL*listLaptop1.get(i).getProd_price();
								}
								System.out.println("Total Balance:"+totalPriceL);
								break;
							
							case 3:
								int fID=0;
								float totalPriceF = 0;
								System.out.println("Products are:");
								String fDesc="Furniture";
								List<Product>listFurniture=uobj.getDescByCategory(fDesc);
								Iterator<Product> itrF=listFurniture.iterator();
								while(itrF.hasNext()) {
									System.out.println(itrF.next());
								}
								System.out.println("Enter ProductID you want to Purchase");
								fID=uscan.nextInt();
								List<Product>listFurniture1=uobj.getDesc(fID);
								for(int i=0;i<listFurniture1.size();i++) {
								System.out.println("Enter Quantity to purchase:");
								int qtyF=uscan.nextInt();
								totalPriceF=qtyF*listFurniture1.get(i).getProd_price();
								}
								System.out.println("Total Balance:"+totalPriceF);
								break;
							
								
							}	
						}while(pchoice!=0);
						}
						else {
							System.out.println("Wrong Choice");
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
	
	
	class ProductNameException extends Exception {

		ProductNameException() {
			super();
		}
		ProductNameException(String error) {
			super(error);
		}

		public void checkProductNameSize(int name) throws ProductNameException {
			if (name <= 4) {
				throw new ProductNameException("Product Name Should not be less than 4 characters!!!!!!!");
			}
		}
	}

