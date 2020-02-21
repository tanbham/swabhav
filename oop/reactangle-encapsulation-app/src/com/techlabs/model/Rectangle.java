package com.techlabs.model;

public class Rectangle {
	private int width;
	private int height;
	private final int MAX_LIMIT = 100;
	private final int MIN_LIMIT = 1;
	
	public void changeWidth(int pwidth) {
		width = checkConstraints(pwidth);
	}
	public void changeHeight(int pheight) {
		height = checkConstraints(pheight);
	}
	
	public int checkConstraints(int value) {
		if(value< MIN_LIMIT) {
			return MIN_LIMIT;
		}
		else if(value > MAX_LIMIT){
			return MAX_LIMIT;
		}
		else {
			return value;
		}
	}
	
	public int readWidth() {
		return width;
	}
	public int readHeight() {
		return height;
	}
}
