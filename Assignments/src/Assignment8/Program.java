package Assignment8;

import java.util.Scanner;
import java.util.stream.Stream;

class Item{
	private double cost;
	private float profit;
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public float getProfit() {
		return profit;
	}
	public void setProfit(float profit) {
		this.profit = profit;
	}
	public Item(double cost, float profit) {
		super();
		this.cost = cost;
		this.profit = profit;
	}
	
	@Override
	public String toString() {
		return "Item [cost=" + cost + ", profit=" + profit + "]";
	}
	public double sellingPrice() {
		double sellprice=cost * (1 + profit / 100);
		System.out.println("item class"+sellprice);
		return sellprice;
	}
}

class UsedItem extends Item{
	private float discount;

	
	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public UsedItem(double cost, float profit,float discount) {
		super(cost, profit);
		// TODO Auto-generated constructor stub
		this.discount=discount;
	}
	
	public double sellingPrice() {
		double sellprice=super.sellingPrice();
		double discountprice=sellprice-(sellprice*discount/100);
		System.out.println("UserItem"+discountprice);
		return discountprice;
	}

	@Override
	public String toString() {
		return "user Item=" + discount+ " " +"Cost ="+super.getCost() ;
	}
	
}

public class Program {
	
	public static double totalSellingPrice(Item[] i) {
		double totalsellingprice = 0;
		for(Item item: i) {
		if(item instanceof Item) {
			if(!(item instanceof UsedItem)) {
			totalsellingprice=totalsellingprice+item.sellingPrice();
			}
		}
		}
		
		return totalsellingprice;
	}
	
	
	public static double totalDiscount(Item[] i) {
		double totaldiscount = 0;
		for(Item item: i) {
		if(item instanceof UsedItem) {
			Item items = new Item(item.getCost(),item.getProfit());
			totaldiscount+=items.sellingPrice()-item.sellingPrice();
			
			
		}
		}
		
		return totaldiscount;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Item[] items= {new Item(200, 9),new UsedItem(200, 9, 10)};
//		System.out.println(totalSellingPrice(items));
//		System.out.println(totalDiscount(items));
		
		int choices = 0;
		do {
			Scanner uscan=new Scanner(System.in);
			System.out.println("1.enter the cost of item\n2.enter the discount of item\n0.EXIT");
			choices=uscan.nextInt();
			if(choices==1) {
			System.out.println("enter the cost of item to display");
			double ucost=uscan.nextDouble();
			Stream.of(items).filter(i->i.getCost()>ucost).forEach(System.out::println);
			}
			else if(choices==2) {
				System.out.println("enter the discount of item");
				float discount=uscan.nextFloat();
				Stream.of(items).filter(i->{
					if(i instanceof UsedItem) {
					return ((UsedItem) i).getDiscount()>discount;
				}
					return false;
				})
				.forEach(System.out::println);
				}else {
				
					System.out.println("Select Valid Option!!!");
				
			}
			}while(choices!=0);
		
	}

}







/*

public static double totalSellingPrice(Item[] i) {
		double totalsellingprice = 0;
		for(Item item: i) {
		System.out.println(item.getClass().getName());
			totalsellingprice=totalsellingprice+item.sellingPrice();
			
		
		}
		
		return totalsellingprice;
	}
	
	
	public static double totalDiscount(Item[] i) {
		double totaldiscount = 0;
		for(Item item: i) {
		if(item instanceof UsedItem) {
			UsedItem useditem = (UsedItem) item;
			totaldiscount=totaldiscount+useditem.getDiscount();
			
			
		}
		}
		
		return totaldiscount;
	}


*/