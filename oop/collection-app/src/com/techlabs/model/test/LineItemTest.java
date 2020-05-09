package com.techlabs.model.test;

import java.util.ArrayList;

import com.techlabs.model.LineItem;

public class LineItemTest {
	public static void main(String args[]) {
		case1();
		case2();
	}

	private static void case2() {
		ArrayList<LineItem> cart = new ArrayList<LineItem>();
		double sum = 0.0;
		cart.add(new LineItem(101,"Book",100,4));
		cart.add(new LineItem(102,"Vegies",50,2));
		cart.add(new LineItem(103,"Pen",10,2));
		
		for(LineItem item : cart) {
				sum = sum + item.calculateTotal();
		}
		System.out.println("Total amount is "+ sum);
	}

	private static void case1() {
		ArrayList cart = new ArrayList();
		double sum = 0.0;
		cart.add(new LineItem(101,"Book",100,4));
		cart.add(new LineItem(102,"Vegies",50,2));
		cart.add(new LineItem(103,"Pen",10,2));
		cart.add("swabhav");
		
		for(Object item : cart) {
			if(item instanceof LineItem) {
				sum = sum + ((LineItem) item).calculateTotal();
			}
		}
		System.out.println("Total amount is "+ sum);
	}
}
