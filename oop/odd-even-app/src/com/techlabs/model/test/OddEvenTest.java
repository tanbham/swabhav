package com.techlabs.model.test;

import java.util.ArrayList;

import com.techlabs.model.EvenFinder;
import com.techlabs.model.OddFinder;

public class OddEvenTest {
	public static void main(String args[]) {
		
		OddFinder findodd = new OddFinder();
		EvenFinder findeven = new EvenFinder();
		
		ArrayList<Integer> listOfEven = findeven.getEvenNumbers();
		ArrayList<Integer> listOfOdd = findodd.getOddNumbers();
		
		System.out.println("Even numbers are");
		printInfo(listOfEven);
		
		System.out.println("Odd numbers are");
		printInfo(listOfOdd);
		
	}

	private static void printInfo(ArrayList<Integer> list) {
		System.out.println(list.size());
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
	}


	
}
