package com.techlabs.exceptions.test;

import java.util.Scanner;

import com.techlabs.exceptions.UserDefinedArithmeticException;

public class TestUncheckedException {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		
		
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
	
		try {
			System.out.println("number1 divide by number2 is "+divide(number1,number2));
		} catch (UserDefinedArithmeticException e) {
			System.out.println(e);
		}
	}

	private static int divide(int number1, int number2) throws UserDefinedArithmeticException {
		if(number2 == 0) {
			throw new UserDefinedArithmeticException();
		}
		else
			return number1 % number2;
	}
}
