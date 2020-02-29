package com.techlabs.model;

public class Rectangle {
	private int width;
	private int height;
	private String color;
	private static final String DEFAULT_COLOR = "red";

	
	public Rectangle(int pwidth, int pheight , String pcolor) { 
		String newpcolor = checkColor(pcolor);
		width = checkDimension(pwidth);
		height = checkDimension(pheight);
		color = newpcolor;
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
	
	public String getColor() {
		if(color == null) {
			return DEFAULT_COLOR;
		}
		return color;
	}
	
	private int checkDimension(int dimension) {
		if(dimension <= 0) {
			return 1;
		}
		return dimension;
	}
	
	private String checkColor(String pcolor) {
		if(pcolor == null) {
			return DEFAULT_COLOR;
		}
		if(!pcolor.equalsIgnoreCase("red") &&  !pcolor.equalsIgnoreCase("green") &&  !pcolor.equalsIgnoreCase("blue")) {
			pcolor = DEFAULT_COLOR;
		}
		return pcolor;
		
	}
	
}
