package com.techlabs.model;

import java.util.ArrayList;

public class EvenFinder {
private ArrayList<Integer> listOfEven;
	
	public EvenFinder() {
		listOfEven = new ArrayList<Integer>();	
	}
	
	public ArrayList<Integer> getEvenNumbers(){
		for(int num = 1 ; num <= 100 ; num++) {
			if(num % 2 == 0) {
				listOfEven.add(num);
			}
		}
		return listOfEven;
	}
}
