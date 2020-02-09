package com.techlabs.calisthenics;

public class RuleOneFollowed {
	private static int value = 1;
	private static int twoByTwoMatrix[][] = new int[3][3];
	
	public static void main(String args[]) {
		addElements();
		displayMatrix();
	}
	
	public static void addElements() {
		for(int row=0 ; row<3 ; row++) {
			addColElements(row);
		}
	}
	
	public static void addColElements(int row) {
		for(int col=0 ; col<3 ; col++) {
			twoByTwoMatrix[row][col] = value;
		}
		value++;
	}
	
	public static void displayMatrix() {
		for(int row=0 ; row<3 ; row++) {
			displayColElements(row);
		}
	}
	
	public static void displayColElements(int row) {
		for(int col=0 ; col<3 ; col++) {
			System.out.print(twoByTwoMatrix[row][col]);
		}
		System.out.println();
	}
	
	
}
