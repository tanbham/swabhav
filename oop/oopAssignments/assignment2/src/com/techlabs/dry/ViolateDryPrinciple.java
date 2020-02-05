package com.techlabs.dry;

public class ViolateDryPrinciple {
	public static void main(String args[]) {
		int randomNumbers[] = {1,2,3,5,8};
		//calculate sum of array elements and find units place digit and tens place digit of sum;
		int unitsPlaceDigit = calculateUnitsPlaceDigit(randomNumbers);
		int tensPlaceDigit = calculateTensPlaceDigit(randomNumbers);
		System.out.println("Units place digit is "+unitsPlaceDigit+" and tens place digit is "+tensPlaceDigit);
	}
	
	
	private static int calculateUnitsPlaceDigit(int randomNumbers[]){
		int sum = 0;
		for(int i : randomNumbers) {
			sum = sum + i;
		}
		return sum%10;
	}
	
	private static int calculateTensPlaceDigit(int randomNumbers[]) {
		int sum = 0;
		for(int i : randomNumbers) {
			sum = sum + i;
		}
		return sum/10;
	}
}
