package com.techlabs.model;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Before;
import org.junit.Test;

public class ProductJUnitTest {
	Product pen;
	
	@Before
	public void test_generate_an_instance_ofProduct() {
		pen = new Product(UUID.randomUUID(),"Pen",50,10);
	}
	
	@Test
	public void test_GetTotalCost_45_after_discount_of_10_percent() {
		double expectedCost = 45;
		double actualCost = pen.getTotalCost();
		
		assertEquals(expectedCost, actualCost,1);
	}

	@Test
	public void testGetName() {
		String expectedName = "Pen";
		String actualName = pen.getName();
		
		assertEquals(expectedName,actualName);
	}

	@Test
	public void testGetDiscountPercentage() {
		double expectedPercent = 10;
		double actualPercent = pen.getDiscountPercentage();
		
		assertEquals(expectedPercent,actualPercent,1);
	}

}
