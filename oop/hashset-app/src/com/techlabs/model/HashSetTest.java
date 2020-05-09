package com.techlabs.model;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String args[]) {
		case1();
		case2();
	}

	private static void case2() {
		HashSet<LineItem> items = new HashSet<LineItem>();
		items.add(new LineItem(101,"Book",100,4));
		items.add(new LineItem(101,"Book",100,4));
		
		LineItem item3 = new LineItem(103,"pen",5,100);
		LineItem item4 = new LineItem(103,"pen",5,100);
		
		System.out.println(item3.equals(item4));
		System.out.println(items.size());
	}

	private static void case1() {
		HashSet<String> names = new HashSet<String>();
	    names.add("Swabhav");
	    names.add("Swabhav");
	    System.out.println(names.size());
	}
}
