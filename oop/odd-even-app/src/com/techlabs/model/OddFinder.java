package com.techlabs.model;

import java.util.ArrayList;

public class OddFinder {
	private ArrayList<Integer> listOfOdd;
	
	public OddFinder() {
		listOfOdd = new ArrayList<Integer>();
		for(int num = 1 ; num <= 100 ; num++) {
			if(num % 2 != 0) {
				listOfOdd.add(num);
			}
		}
	}
	
	public ArrayList<Integer> getOddNumbers(){
		for(int num = 1 ; num <= 100 ; num++) {
			if(num % 2 != 0) {
				listOfOdd.add(num);
			}
		}
		return listOfOdd;
	}

}
