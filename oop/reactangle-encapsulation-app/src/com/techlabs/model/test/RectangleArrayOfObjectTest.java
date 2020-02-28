package com.techlabs.model.test;

import com.techlabs.model.Rectangle;

public class RectangleArrayOfObjectTest {
	public static void main(String args[]) {
		Rectangle [] rectangles = new Rectangle[3];
		System.out.println(rectangles[0]);
		
		rectangles[0] = new  Rectangle();
		rectangles[0].changeWidth(20);
		rectangles[0].changeHeight(10);
		
		Rectangle r1 = new Rectangle();
		rectangles[1] = r1;
		rectangles[1].changeWidth(30);
		rectangles[1].changeHeight(40);
		
		Rectangle r2 = new Rectangle();
		rectangles[2] = r2;
		rectangles[2].changeWidth(80);
		rectangles[2].changeHeight(90);	
		
		printInfo(rectangles);
		//printInfo1(rectangles);
		//printInfo1(rectangles[2]);	
	}
	
	public static void printInfo(Rectangle[] rectangles) {
		for(Rectangle rect : rectangles) {
			System.out.printf("width = %d , height = %d \n",rect.readWidth(),rect.readHeight());
		}
		System.out.println();
	}
	
	
	public static void printInfo1(Rectangle[] reactangles1) {
		for(Rectangle rect: reactangles1) {
			printInfo1(rect);
		}
		System.out.println();
	}
	
	private static void printInfo1(Rectangle rect) {
		System.out.printf("width = %d , height = %d \n",rect.readWidth(),rect.readHeight());
	}	
}
