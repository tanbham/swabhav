package com.techlabs.calisthenics;

public class RuleOneViolated {
	public static void main(String args[]) {
		int twoByTwoMatrix[][] = new int[3][3];
		int value = 1;
		
		for(int row=0 ; row<3 ; row++) {
			for(int col=0 ; col<3 ; col++) {
				twoByTwoMatrix[row][col] = value;
			}
			value++;
		}
		
		for(int row=0 ; row<3 ; row++) {
			for(int col=0 ; col<3 ; col++) {
				System.out.print(twoByTwoMatrix[row][col]);
			}
			System.out.println();
		}
	}
}
