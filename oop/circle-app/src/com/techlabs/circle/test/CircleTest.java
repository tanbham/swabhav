package com.techlabs.circle.test;

import com.techlabs.circle.Circle;

public class CircleTest {
	private static int minIndexOfCircleArray;

	public static void main(String args[]) {
		Circle [] circles = new Circle[5];
		
		circles[0] = new Circle();
		circles[0].setRadius(2.5f);
		
		circles[1] = new Circle();
		circles[1].setRadius(2.6f);
		
		circles[2] = new Circle();
		circles[2].setRadius(2.7f);
		
		circles[3] = new Circle();
		circles[3].setRadius(2.8f);
		
		circles[4] = new Circle();
		circles[4].setRadius(2.9f);
		
		printInfo(circles);
		//printInfo(circles[0]);
		Circle big = findBigCircle(circles);
		Circle small = findSmallCircle(circles);
		System.out.println("Largest Circle is of radius " + big.getRadius());
		System.out.println("Smallest Circle is of radius " + small.getRadius());
	}
	

	public static void printInfo(Circle [] circles) {
		for(Circle cir : circles) {
			printInfo(cir);
		}
	}
	public static void printInfo(Circle c) {
		System.out.printf("Radius = %f , Area = %f ,Perimeter= %f \n",c.getRadius(),c.calculateArea(),c.calculatePerimeter());
	}
	
	public static Circle findSmallCircle(Circle [] circles) {
		int flag = 0;
		int index = checkCircle(circles,flag);
		return circles[index];
	}
	
	public static Circle findBigCircle(Circle [] circles) {
		int flag = 1;
		int index = checkCircle(circles,flag);
		return circles[index];
	}
	
	public static int checkCircle(Circle[] circles,int flag) {
		float  minRadius = 0.0f;
		float  maxRadius = 0.0f;
		int index = 0;
		for(int i=0 ; i<circles.length ; i++) {
			if(flag == 0 && circles[i].getRadius()< minRadius) {
				index = i;
			}
			if(flag == 1 && circles[i].getRadius()> maxRadius) {
				index = i;
			}
		}
		return index;
	}
	
}
