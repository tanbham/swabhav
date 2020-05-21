package model.test;

import model.AreaCalculator;
import model.Circle;
import model.Rectangle;

public class TestOCP {
	public static void main(String args[]){
		Circle circle = new Circle(5);
		Rectangle rect = new Rectangle(2,3);
		
		AreaCalculator rectangleArea = new AreaCalculator(rect);
		AreaCalculator circleArea = new AreaCalculator(circle);
		
		System.out.println(rectangleArea.calculateArea());
		System.out.println(circleArea.calculateArea());
		
	}
}
