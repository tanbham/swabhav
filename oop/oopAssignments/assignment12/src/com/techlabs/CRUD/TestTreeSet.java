package com.techlabs.CRUD;

import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String args[]) {
		
		TreeSet<Integer> set= new TreeSet<Integer>();
	
		set.add(1);
		set.add(1);
		set.add(20);
		set.add(13);
		set.add(10);
		set.add(12);
		set.add(11);
		
		System.out.println("Maintains ascending order");
		System.out.println(set);
	}
}
