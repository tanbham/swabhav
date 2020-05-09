package com.techlabs.model;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String args[]) {
		case1();
		case2();
		case3();
	}

	private static void case1() {
		NameComparator nameCompare = new NameComparator();
		TreeSet<LineItem> items = new TreeSet<LineItem>(nameCompare);
		items.add(new LineItem(109,"book",10,500));
		items.add(new LineItem(102,"pen",5,10));
		items.add(new LineItem(103,"soap",1,1000));
		System.out.println("Sorted by name = "+items);
	}

	private static void case2() {
		PriceComparator priceCompare = new PriceComparator();
		TreeSet<LineItem> items = new TreeSet<LineItem>(priceCompare);
		items.add(new LineItem(101,"book",10,500));
		items.add(new LineItem(102,"pen",5,10));
		items.add(new LineItem(103,"soap",1,1000));
		System.out.println("Sorted by price = "+items);
	}

	private static void case3() {
		QuantityComparator quantityCompare = new QuantityComparator();
		TreeSet<LineItem> items = new TreeSet<LineItem>(quantityCompare);
		items.add(new LineItem(101,"book",10,500));
		items.add(new LineItem(102,"pen",5,10));
		items.add(new LineItem(103,"soap",1,1000));
		System.out.println("Sorted by quantity = "+items);
	}
}
