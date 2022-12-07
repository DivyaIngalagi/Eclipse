package Assignment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;






public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Product> product_list = new ArrayList<Product>();
		
		Product prod=new Product();
		prod.setProductNo(101);
		prod.setPrice(100);
		prod.setStock(2);
		
		Product prod1=new Product();
		prod1.setProductNo(102);
		prod1.setPrice(1000);
		prod1.setStock(2);
		
		product_list.add(prod);
		product_list.add(prod1);
		
		System.out.println();
		System.out.println("Products Are:");
		Iterator<Product> itr=product_list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		Scanner uscan=new Scanner(System.in);
		int pid;
		
		
		int schoice;
		do {
			System.out.println("Enter the Product ID to Update");
			pid=uscan.nextInt();
		System.out.println("enter what to update price or stock???");
		System.out.println("1.price\n2.stock\n0.EXIT");
		System.out.println("------------------");
		schoice=uscan.nextInt();
		
		Iterator<Product> itr1=product_list.iterator();
		while(itr1.hasNext()) {
			Product product = (Product) itr1.next();
			if(product.getProductNo()==pid) {	
				if(schoice==1) {
					System.out.println("enter price to update");
					int price=uscan.nextInt();
				product.setPrice(price);
				System.out.println();
				System.out.println("------------------");
				System.out.println("The Updated Products are:");
				Iterator<Product> itr11=product_list.iterator();
				while(itr11.hasNext()) {
					System.out.println(itr11.next());
				}
				System.out.println("------------------");
			}else if(schoice==2) {
				System.out.println("enter stock to update");
				int stock=uscan.nextInt();
				product.setStock(stock);
				System.out.println();
				System.out.println("------------------");
				System.out.println("The Updated Products are:");
				Iterator<Product> itr11=product_list.iterator();
				while(itr11.hasNext()) {
					System.out.println(itr11.next());
				}
				System.out.println("------------------");
			}else {
				System.out.println("Wrong Choice");
			}
			}
			
		}
		
		}while(schoice!=0);
	}

}
