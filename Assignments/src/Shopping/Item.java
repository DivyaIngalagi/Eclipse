package Shopping;

public  class Item {
	private  String name ;
	private  String brand ;
	
	
	public Item(String name, String brand) {
		this.name=name;
		this.brand=brand;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", brand=" + brand + "]";
	}
	public String getBrand() {
		return brand;
	}
	
	
}
