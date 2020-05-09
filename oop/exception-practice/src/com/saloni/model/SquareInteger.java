package com.saloni.model;

import java.util.Scanner;

public class SquareInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		Integer integer = 0;
		try {
			integer = Integer.parseInt(input);
			System.out.println("The square value is "+integer*integer);
			System.out.println("The work has been done successfully");
		}
		catch(Exception e){
			System.out.println("Entered input is not a valid format for an integer.");
		}
	}

}
