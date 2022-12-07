package com.mock;

import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.*;


import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class HamcrestTestExample {

	
	@Test
	public void hamcrestMethodTest()
	{
		
		List<Integer> score =Arrays.asList(90,67,100,101,105);
		assertThat(score,hasSize(5));
		//assertThat(score,hasItems(67,105));
		//assertThat(score,everyItem(greaterThan(100)));
		
	}
}
