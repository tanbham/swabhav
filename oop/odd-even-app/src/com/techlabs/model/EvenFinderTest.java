package com.techlabs.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class EvenFinderTest {

	EvenFinder findeven = new EvenFinder();
	
	@Test
	public void testEvenNumberCount() {
		//arrange
		ArrayList<Integer> list = findeven.getEvenNumbers();
		int expected = 50;
		
		//Act
		int actual = list.size();
		
		//Assert
		assertEquals(expected,actual);
	}
	
	@Test
	public void testCheckIfEven() {
		//arrange
		ArrayList<Integer> list = findeven.getEvenNumbers();
		int check = 2;
		
		//Assert
		assertTrue(list.contains(check));
	}

}
