package com.techlabs.model;

public class Rectangle {
	private int width;
	private int height;
	private final int MAX_LIMIT = 100;
	private final int MIN_LIMIT = 1;
	
	public void changeWidth(int pwidth) {
		if(pwidth < MIN_LIMIT) {
			width = MIN_LIMIT;
		}
		else if(pwidth> MAX_LIMIT){
			width = MAX_LIMIT;
		}
		else {
			width = pwidth;
		}
	}
	public void changeHeight(int pheight) {
		if(pheight< MIN_LIMIT) {
			height = MIN_LIMIT;
		}
		else if(pheight > MAX_LIMIT){
			height = MAX_LIMIT;
		}
		else {
			height = pheight;
		}
	}
	
	public int readWidth() {
		return width;
	}
	public int readHeight() {
		return height;
	}
}
