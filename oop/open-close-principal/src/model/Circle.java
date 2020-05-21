package model;

public class Circle implements IShape{
	private int radius;
	
	public Circle(int radius){
		this.radius = radius;
	}

	public double area() {
		return radius*radius*3.141;
	}

}
