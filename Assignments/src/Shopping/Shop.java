package Shopping;

import java.util.ArrayList;
import java.util.List;

public class Shop {

	public Item[] getItems() {
		
		List<Item> items= new ArrayList<Item>();
		items.add(new Item("CPU","Intel"));
		items.add(new Item("SSD","Samsung"));
		items.add(new Item("Mouse","Logitec"));
		
		return items.stream().toArray(Item[]::new);	
	}
	
	
	public List<Customer> getCustomers(){
		
		List<Customer> customer=new ArrayList<Customer>();
		customer.add(new Customer("Jack",25000,3));
		customer.add(new Customer("Jill",45000,5));
		return customer;
		
	}
}
