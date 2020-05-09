package com.techlabs.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.techlabs.model.test.InventoryTest;

public class GuitarSpecJUnitTest {

	static Guitar guitar;
	static {
		Inventory inventory = new Inventory();
		InventoryTest.initiliazeInventory(inventory);
		List<Guitar> listOfGuitars = inventory.getListOfGuitarsInInventory();
		guitar = listOfGuitars.get(0);
	}
	
	@Test
	public void test_GetBuilder_Of_firstGuitar_added_in_Inventory() {
		GuitarSpec guitarSpec = guitar.getSpec();
		
		String expectedBuilder = "Collings";
		String actualBuilder = String.valueOf(guitarSpec.getBuilder());
		
		assertEquals(expectedBuilder, actualBuilder);	
	}

	@Test
	public void test_GetModel_Of_firstGuitar_added_in_Inventory() {
		GuitarSpec guitarSpec = guitar.getSpec();
		
		String expectedModel = "xyz";
		String actualModel = guitarSpec.getModel();
		
		assertEquals(expectedModel, actualModel);	
	}

	@Test
	public void test_GetType_Of_firstGuitar_added_in_Inventory() {
		GuitarSpec guitarSpec = guitar.getSpec();
		
		String expectedType = "Acoustics";
		String actualType = String.valueOf(guitarSpec.getType());
		
		assertEquals(expectedType, actualType);	
	}

	@Test
	public void test_GetBackwood_Of_firstGuitar_added_in_Inventory() {
		GuitarSpec guitarSpec = guitar.getSpec();
		
		String expectedBackWood = "African";
		String actualBackWood = String.valueOf(guitarSpec.getBackwood());
		
		assertEquals(expectedBackWood, actualBackWood);
	}

	@Test
	public void test_GetTopwood_Of_firstGuitar_added_in_Inventory() {
		GuitarSpec guitarSpec = guitar.getSpec();
		
		String expectedTopwood = "African";
		String actualTopwood = String.valueOf(guitarSpec.getTopwood());
		
		assertEquals(expectedTopwood, actualTopwood);
	}

}
