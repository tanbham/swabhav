package com.techlabs.model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class OddFinderTest {
	
	OddFinder findodd = new OddFinder();

	@Test
	public void testOddNumberCount() {
		//arrange
		ArrayList<Integer> list = findodd.getOddNumbers();
		int expected = 100;
				
		//Act
		int actual = list.size();
				
		//Assert
		assertEquals(expected,actual);
	}
	
	@Test
	public void testCheckIfOdd() {
		//arrange
		ArrayList<Integer> list = findodd.getOddNumbers();
		int check = 3;
		
		//Assert
		assertTrue(list.contains(check));
	}

}
