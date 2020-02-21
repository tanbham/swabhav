package com.techlabs.model.test;

import com.techlabs.model.Rectangle;

public class RectangleTest {
	public static void main(String args[]) {
		Rectangle small = new Rectangle();
		small.changeWidth(50);
		small.changeHeight(-10);
		System.out.printf("width = %d , height = %d\n",small.readWidth(),small.readHeight());

		
		Rectangle big = new Rectangle();
		big.changeWidth(50000);
		big.changeHeight(10000);
		System.out.printf("width = %d , height = %d\n",big.readWidth(),big.readHeight());
		
	}
}
