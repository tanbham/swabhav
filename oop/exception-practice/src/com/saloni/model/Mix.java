package com.saloni.model;

import java.util.Scanner;

public class Mix {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int number = sc.nextInt();
		int array[] = new int[number];
		try {
			for(int i=0; i<number; i++) {
				String input = sc.next();
				array[i] = Integer.parseInt(input);
			}
			System.out.println("Enter the index of the array element you want to access");
			int index = sc.nextInt();
			int element = 0;
			element = array[index];
			System.out.println("The array element at index "+index+" = "+element);
		}
		catch(NumberFormatException e) {
			System.out.println(e.getClass().getName());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getClass().getName());
		}
	}
}
