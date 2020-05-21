package model;

public class Rectangle implements IShape{
	private int length;
	private int breadth;
	
	public Rectangle(int length , int breadth){
		this.length = length;
		this.breadth = breadth;
	}

	public double area() {
		return length*breadth;
	}
	
	
}
