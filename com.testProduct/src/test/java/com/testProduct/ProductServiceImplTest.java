package com.testProduct;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

class ProductServiceImplTest {

	@Test
	void testProductServiceImpl_Lessthan500() throws Exception {
		ProductService prodserv = mock(ProductService.class);
		List<Product> prodlist = Arrays.asList(new Product(1,"Mobile",155.00),new Product(2,"Laptop",355.00),new Product(3,"Charger",400.00),new Product(4,"Pen",211.00),new Product(5,"Glasses",355.00));
		
		when(prodserv.getAllProduct()).thenReturn(prodlist);
		
		ProductServiceImpl prodServiceImpl=new ProductServiceImpl(prodserv);
		
		List<Product>  prod = prodServiceImpl.fetchAllProduct();
		
		assertEquals(5, prod.size());
	}
	
	@Test()
	void testProductServiceImpl_Morethan500() throws Exception {
		ProductService prodserv = mock(ProductService.class);
		List<Product> prodlist = Arrays.asList(new Product(1,"Mobile",155.00),new Product(2,"Laptop",35555.00),new Product(3,"Charger",400.00),new Product(4,"Pen",500.00),new Product(5,"Glasses",355.00));
		
		when(prodserv.getAllProduct()).thenReturn(prodlist)	;
		ProductServiceImpl prodServiceImpl=new ProductServiceImpl(prodserv);

//		List<Product>  prod = prodServiceImpl.fetchAllProduct();
		
		assertThrows(Exception.class, ()->prodServiceImpl.fetchAllProduct());
	}
	@Test
	void testProductServiceImpl_EqualToZero() throws Exception {
		ProductService prodserv = mock(ProductService.class);
		List<Product> prodlist = Arrays.asList();
		
		when(prodserv.getAllProduct()).thenReturn(prodlist);
		
		ProductServiceImpl prodServiceImpl=new ProductServiceImpl(prodserv);
		
		List<Product>  prod = prodServiceImpl.fetchAllProduct();
		
		assertEquals(0, prod.size());
	}
}
