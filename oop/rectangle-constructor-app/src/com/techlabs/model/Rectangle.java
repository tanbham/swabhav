package com.techlabs.model;

public class Rectangle {
	private int width;
	private int height;
	private ColorType color;

	
	public Rectangle(int pwidth, int pheight , ColorType pcolor) { 
		width = checkDimension(pwidth);
		height = checkDimension(pheight);
		color = pcolor;
	}
	
	public Rectangle(int pwidth , int pheight) {
		width = checkDimension(pwidth);
		height = checkDimension(pheight);
	}
	
	public int calculateArea() {
		return height*width;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public ColorType getColor() {
		if(color == null) {
			return ColorType.RED;
		}
		return color;
	}
	
	private int checkDimension(int dimension) {
		if(dimension <= 0) {
			return 1;
		}
		return dimension;
	}
}
