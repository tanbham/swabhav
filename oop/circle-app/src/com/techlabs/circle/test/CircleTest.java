package com.techlabs.circle.test;

import com.techlabs.circle.Circle;

public class CircleTest {
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
		//Circle big = findBigCircle(circles);
		//Circle small = findSmallCircle(circles);
		System.out.println("Largest Circle is of radius " + findBigCircle(circles).getRadius());
		System.out.println("Smallest Circle is of radius " + findSmallCircle(circles).getRadius());
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
		int minIndexOfCircleArray = 0;;
		float  minRadius = 0.0f;
		for(int i=0 ; i<circles.length ;i++) {
			if(circles[i].getRadius() < minRadius) {
				minIndexOfCircleArray = i;
			}
		}
		return 	circles[minIndexOfCircleArray];
	}
	
	public static Circle findBigCircle(Circle [] circles) {
		int maxIndexOfCircleArray = 0;
		float  maxRadius = 0.0f;
		for(int i=0 ; i<circles.length ;i++) {
			if(circles[i].getRadius() > maxRadius) {
				maxIndexOfCircleArray = i;
			}
		}
		return 	circles[maxIndexOfCircleArray];
	}
}
