package com.techlabs.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.techlabs.model.test.InventoryTest;

public class GuitarJUnitTest {
	
	static Guitar guitar;
	static {
		Inventory inventory = new Inventory();
		InventoryTest.initiliazeInventory(inventory);
		List<Guitar> listOfGuitars = inventory.getListOfGuitarsInInventory();
		guitar = listOfGuitars.get(0);
	}

	@Test
	public void test_getSerialNumber_Of_firstGuitar_added_in_Inventory() {
		String expectedSerialNumber = guitar.getSerialNumber();
		String actualSerialNumber = "101";
		
		assertEquals(expectedSerialNumber , actualSerialNumber);
	}

	@Test
	public void test_getPrice_Of_firstGuitar_added_in_Inventory() {
		double expectedPrice = guitar.price();
		double actualPrice = 5000.0;
		
		assertEquals(expectedPrice, actualPrice,1);
	}

}
