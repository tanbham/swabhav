package com.techlabs.circle;

public class Circle {
	private float radius;
	private float pi = 3.14f;
	
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float getRadius() {
		return radius;
	}
	
	public float calculateArea() {
		return pi*radius*radius;
	}
	
	public float calculatePerimeter() {
		return pi*2*radius;
	}  
}

