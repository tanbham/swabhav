package com.saloni.model;

import java.util.Scanner;

public class RuntimeExceptionHandling {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int number = sc.nextInt();
		int array[] = new int[number];
		for(int i=0; i<number; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the index of the array element you want to access");
		int index = sc.nextInt();
		int element = 0;
		try {
			element = array[index];
			System.out.println("The array element at index "+index+" = "+element);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getClass().getName());
		}
	}
}
