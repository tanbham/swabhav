package com.techlabs.model.test;

import com.techlabs.model.Rectangle;

public class RectangleRefTest {
	public static void main(String args[]) {
		Rectangle small = null;//small excepts an object
		System.out.println(small);
		small = new Rectangle();
		System.out.println(small);
		small.height = 10;
		small.width = 5;
		System.out.printf("width = %d , height = %d , area = %d \n",small.width,small.height,small.calculateArea());
		
		small.height = 100000; //violates encapsulation bcs it does not have any constraints
		small.width = 5000;
		System.out.printf("width = %d , height = %d , area = %d \n",small.width,small.height,small.calculateArea());	
	}
}
