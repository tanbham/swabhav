package com.techlabs.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class HashMapSortingTest {
	public static void main(String args[]) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		//add
		map.put(100,"Tanmay");
		map.put(25,"Swabhav");
		map.put(1,"AurionPro");
		System.out.println(map);
		
		ArrayList<Integer> sortedKeys = new ArrayList<Integer>(map.keySet());
		Collections.sort(sortedKeys);
		
		for(int i : sortedKeys) {
			System.out.print(i+"="+map.get(i)+" ");
		}
		
	}
}
