package com.techlabs.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.techlabs.model.test.InventoryTest;

public class InventoryJUnitTest {
	Inventory inventory = new Inventory();

	@Test
	public void test_Add_6_new_Guitars_in_Inventory() {
		InventoryTest.initiliazeInventory(inventory);
		
		int expected = 6;
		int actual = inventory.getSizeOfLinkedListOfGuitars();
		
		assertEquals(expected,actual);
	}

	@Test
	public void test_get_Guitar_of_serial_number_101_from_Inventory() {
		InventoryTest.initiliazeInventory(inventory);
		
		Guitar expectedGuitar = new Guitar("101", 5000, Builder.COLLINGS, "xyz", Type.ACOUSTICS, Wood.AFRICAN, Wood.AFRICAN);
		Guitar actualGuitar = inventory.getGuitar("101");
		
		assertEquals(expectedGuitar, actualGuitar);
	}

	@Test
	public void test_search_for_guitar_in_inventory_with_provided_specifications() {
		InventoryTest.initiliazeInventory(inventory);
		
		GuitarSpec whatYouLike = new GuitarSpec(Builder.FENDER, "abc", Type.ACOUSTICS, Wood.AFRICAN, Wood.AFRICAN);
		List<Guitar> matchingGuitars = inventory.search(whatYouLike);
		
		assertTrue(!matchingGuitars.isEmpty());
	}

}
