package com.hamcrest;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;


import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

public class HamcrestTestExample {

	
	@Test
	public void hamcrestMethodTest()
	{
		
		List<Integer> score =Arrays.asList(90,67,100,101,105);
		//assertThat(score,hasSize(5));
		assertThat(score,hasItems(67,105));
		assertThat(score,everyItem(greaterThan(100)));
		
	}
}