package com.techlabs.basic;

public class ArrayToFunctionTest {
	public static void main(String names[]) {
		double cgpa[] = {2.5, 5.5 ,2.3};
		upgrade(cgpa);
		for(double show : cgpa) {
			System.out.println(show);
		}
	}
	
	private static void upgrade(double cgpa[]) {
		for(int i=0 ; i<cgpa.length ; i++) {
			cgpa[i] = cgpa[i] + cgpa[i]*0.1;
		}
	}
}
