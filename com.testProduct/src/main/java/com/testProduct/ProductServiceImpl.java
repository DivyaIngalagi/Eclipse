package com.testProduct;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {
	ProductService productservice;

	public ProductServiceImpl(ProductService productservice) {
		super();
		this.productservice = productservice;
	}

	public List<Product> fetchAllProduct() throws Exception{
		
		List<Product> filteredProduct=new ArrayList<Product>();
		List<Product> allProduct=productservice.getAllProduct();
		
		for( Product userlist:allProduct)
		{
			
			if(userlist.getPcost()<=500)
			{
				filteredProduct.add(userlist);
				System.out.println(filteredProduct);
			}else {
				System.out.println(filteredProduct);
				throw new Exception("Product cost is greater than 500");
			}
		}
		System.out.println(filteredProduct.size());
		return filteredProduct;
	}
}
