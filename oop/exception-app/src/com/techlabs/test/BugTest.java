package com.techlabs.test;

public class BugTest {
	public static void main(String args[]) {
		int c = 0;
		try {
			int a = Integer.parseInt(args[0]);   
			int b = Integer.parseInt(args[1]);
		    c = a/b;
			System.out.println(c);
		}
		catch(NumberFormatException e) {
			System.out.println("Please input only numbers");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("No values are passed as input");
		}
		catch(ArithmeticException e) {
			System.out.println("Zero value as denominator not allowed");
		}
		
		System.out.println("End the main");
	}
}
