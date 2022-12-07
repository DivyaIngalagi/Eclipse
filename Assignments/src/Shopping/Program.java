package Shopping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner uscan=new Scanner(System.in);
		Shop shop = new Shop();
////		System.out.println("Item Available Details:");
		Item[] item= shop.getItems();
		
		for(int i=0;i<item.length;i++) {
			System.out.println(item[i].getName()+"   "+item[i].getBrand());
		}
		
		
		System.out.println("===================");
		
		
		int choice;
		do {
		System.out.println("1.enter the brand want to display\n0.EXIT");
		choice=uscan.nextInt();
		if(choice==1) {
		System.out.println("enter the brand want to display");
		String brand=uscan.next();
		List<Item> itm=Arrays.asList(item);
		itm.stream().filter(item1->item1.getBrand().equals(brand)).map(t->t.getName()).forEach(System.out::println);
		}else {
			
				System.out.println("Select Valid Option!!!");
			
		}
		}while(choice!=0);
//		
		System.out.println("===================");
		
//		System.out.println("Customer Details Are");
		List<Customer> customers=shop.getCustomers();
		for(Customer customer:customers ) {
			System.out.println(customer);
		}
		System.out.println();
		System.out.println("===================");
//		
		int choices = 0;
		do {
			
		System.out.println("1.enter the purchase want to display\n0.EXIT");
		choices=uscan.nextInt();
		if(choices==1) {
		System.out.println("enter the purchase want to display");
		Double purchase=uscan.nextDouble();
		customers.stream().filter(t -> t.getPurchase()>=purchase).map(t->t.getRating()+"\t"+t.getId()).forEach(System.out::println);
		}else {
			
				System.out.println("Select Valid Option!!!");
			
		}
		}while(choices!=0);
		
		System.out.println("===================");
		
////		System.out.println("Customer Details Are");
		List<Customer> cust=shop.getCustomers();
		for(Customer customer:cust ) {
			System.out.println(customer);
		}
		System.out.println();
		System.out.println("===================");
//		
		int choicep = 0;
		do {
			System.out.println();
		System.out.println("1.enter the purchase want to display\n0.EXIT");
		choicep=uscan.nextInt();
		if(choicep==1) {
		System.out.println("enter the purchase want to display");
		Double purchase=uscan.nextDouble();
//		cust.stream().filter(t -> t.getPurchase()>=purchase).forEach(t->{
//			System.out.println();
//			System.out.print(t.getId()+" ");
//            	for(int i=0;i<t.getRating();i++) {
//            		System.out.print("*");
//            		
//            	}
//            }
//		);
		cust.stream().filter(t -> t.getPurchase()>=purchase).map(t->"*".repeat(t.getRating())+"\t"+t.getId()).forEach(System.out::println);
//		cust.stream().filter(t -> t.getPurchase()>=purchase).map(t->{for(int i=0;i<t.getRating();i++)System.out.print("*");+"\t"+t.getId()).forEach(System.out::println);
//		System.out.println("id="+t.getId()+"  "+"ratings= ="+t.getRating()));
		}else {
			
				System.out.println("Select Valid Option!!!");
			
		}
		}while(choicep!=0);
	}

}







/*
 * forEach(t->{
			int rate=t.getRating();
            if (t.getRating()==rate) {
            	
            		System.out.println("*");
            		
                }
            }
		);
		*/
