package org.techlabs.dry;

public class ApplyDryPrinciple {
	public static void main(String args[]) {
		int randomNumbers[] = {1,2,3,5,8};
		//calculate sum of array elements and find units place digit and tens place digit of sum;
		int unitsPlaceDigit = calculateUnitsPlaceDigit(randomNumbers);
		int tensPlaceDigit = calculateTensPlaceDigit(randomNumbers);
		System.out.println("Units place digit is "+unitsPlaceDigit+" and tens place digit is "+tensPlaceDigit);
	}
	
	private static int calculateUnitsPlaceDigit(int randomNumbers[]){
		int unitDigit = calculateSum(randomNumbers)%10;
		return unitDigit;
	}
	
	private static int calculateTensPlaceDigit(int randomNumbers[]) {
		int tensDigit = calculateSum(randomNumbers)/10;
		return tensDigit;
	}
	
	private static int calculateSum(int randomNumbers[]) {
		int sum = 0;
		for(int i : randomNumbers) {
			sum = sum + i;
		}
		return sum;
	}
}
	
