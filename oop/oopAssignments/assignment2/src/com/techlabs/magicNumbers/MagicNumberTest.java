package com.techlabs.magicNumbers;
import java.util.Scanner;

public class MagicNumberTest {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check if it is magic number or not");
		int number = s.nextInt();
		boolean result = checkMagicNumber(number);
		
		if(result == true) {
			System.out.println("Entered number is magic number");
		}
		else {
			System.out.println("Entered number is not a magic number");
		}
		s.close();
	}
	
	public static boolean checkMagicNumber(int number) {
		int remainder = 0;
		int sumOfDigits = 0;
		
		while(number>0 || sumOfDigits>9) {
			if(number == 0) {
				number = sumOfDigits;
				sumOfDigits = 0;
			}
			remainder  = number % 10;
			sumOfDigits = sumOfDigits + remainder;
			number = number/10;
		}
		
		if(sumOfDigits == 1) {
			return true;
		}
		else
			return false;
	}
}
