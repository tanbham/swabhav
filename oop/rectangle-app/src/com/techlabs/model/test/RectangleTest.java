package com.techlabs.model.test;

import com.techlabs.model.Rectangle;

public class RectangleTest {
	public static void main(String args[]) {
		Rectangle small = new Rectangle();
		small.height = 5;
		small.width = 10;
		System.out.println("Area of small rect is "+small.calculateArea());
		System.out.println("height of small rect is "+small.height);
		System.out.println("width of small rect is "+small.width);
		
		Rectangle big = new Rectangle();
		big.height = 50;
		big.width = 100;
		System.out.println("Area of small rect is "+big.calculateArea());
		System.out.println("height of large rect is "+big.height);
		System.out.println("width of large rect is "+big.width);
	}
}
