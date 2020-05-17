package com.techlabs.model;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Before;
import org.junit.Test;

public class LineItemJUnitTest {
	LineItem penItem;

	@Before
	public void test_generate_instanceof_LineItem_Product() {
		Product pen = new Product(UUID.randomUUID(),"Pen",50,10);
		penItem = new LineItem(UUID.randomUUID(),10,pen);
	}
	
	@Test
	public void test_get_ItemCost_450_by_buying_10_pens_costing_45() {
		double expectedCost = 450;
		double actualCost = penItem.calculateItemCost();
		
		assertEquals(expectedCost,actualCost,1);
	}

	@Test
	public void test_GetQuantity_10() {
		int actualQuantity = 10;
		int expectedQuantity = penItem.getQuantity();
		
		assertEquals(expectedQuantity,actualQuantity);
	}

	@Test
	public void test_GetProduct_named_Pen() {
		String expectedProductName = "Pen";
		String actualProductName = penItem.getProduct().getName();
		
		assertEquals(expectedProductName,actualProductName);
	}

	@Test
	public void test_get_quantity_11_by_Incrementing_Quantity_by_1() {
		penItem.incrementQuantity();
		int expectedQuantity = 11;
		int actualQuantity = penItem.getQuantity();
		assertEquals(expectedQuantity,actualQuantity);
	}

}
