package com.techlabs.model.test;

import com.techlabs.model.Rectangle;

public class RectanglePrintTest{
	public static void main(String args[]) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		r1.changeHeight(10);
		r1.changeWidth(5);
		r2.changeHeight(20);
		r2.changeWidth(30);
		
		printInfo(r1);
		printInfo(r2);
	}
	
	public static void printInfo(Rectangle r) {
		System.out.printf("width = %d , height = %d ,area = %d\n",r.readWidth(),r.readHeight(),r.readWidth()*r.readWidth());
	
	}
	

}
