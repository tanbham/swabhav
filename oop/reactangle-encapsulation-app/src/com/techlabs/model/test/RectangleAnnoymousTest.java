package com.techlabs.model.test;

import com.techlabs.model.Rectangle;

public class RectangleAnnoymousTest {
	public static void main(String args[]) {
		System.out.println(new Rectangle().readHeight());//READ ONLY PURPOSE
		System.out.println(new Rectangle().readWidth());
	
		new Rectangle().changeHeight(10);
		new Rectangle().changeWidth(20);
		
		printInfo(new Rectangle());
	}
	
	public static void printInfo(Rectangle r) {
		System.out.printf("width = %d , height = %d \n",r.readWidth(),r.readHeight());
	}
}
