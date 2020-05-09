package com.techlabs.CRUD;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {
	public static void main(String args[]) {
		LinkedHashSet <Integer> set = new LinkedHashSet();
		
		//add
		set.add(1);
		set.add(1);
		set.add(3);
		set.add(4);
		set.add(5);
		System.out.println("Maintains insertion order");
		System.out.println(set);
	}
}
