package com.techlabs.model.test;

import com.techlabs.model.Rectangle;

public class RectangleTest {
	public static void main(String args[]) {
	 Rectangle rect1 = new Rectangle(10,20,"blue");
	 Rectangle rect2 = new Rectangle(-30,40,"ORANGE");
	 Rectangle rect3 = new Rectangle(-10,20);
	 Rectangle rect4 = new Rectangle(-10,-20,"BLue");
	 Rectangle rect5 = new Rectangle(10,20,null);
	 
	 displayRectangleInfo(rect1);
	 displayRectangleInfo(rect2);
	 displayRectangleInfo(rect3);
	 displayRectangleInfo(rect4);
	 displayRectangleInfo(rect5);
	}
	
	public static void displayRectangleInfo(Rectangle rect) {
		System.out.println("Height is : "+rect.getHeight() +"\nWidth is : "+rect.getWidth()+"\nColor is :"+rect.getColor()+"\nArea is :"+rect.calculateArea());
		System.out.println();
	}
}
