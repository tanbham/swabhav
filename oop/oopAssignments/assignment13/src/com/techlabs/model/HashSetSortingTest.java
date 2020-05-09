package com.techlabs.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class HashSetSortingTest {
	public static void main(String args[]) {
		HashSet<Integer> hashset = new HashSet<Integer>();
		
		hashset.add(100);
		hashset.add(2);
		hashset.add(1);
		hashset.add(5);
		hashset.add(8);
		System.out.println(hashset);
		//Collections.sort(hashset);  bcs sort takes List as a parameter
		List<Integer> list = new ArrayList<Integer>(hashset); 
        Collections.sort(list); 
        System.out.println(list);

	}
}
