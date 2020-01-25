package com.techlabs.basic;

public class WelcomeTest {
	public static void main(String args[]) {
		System.err.print("h");
		System.err.print(202.f);
		System.err.print(25);
		System.err.print(5000.23);
		System.err.print(true);
		
		printInfo(20);
		printInfo(500.023);
		printInfo('t');
		printInfo(true);
		printInfo(22.2);
	}
	
	public static void printInfo(int integer) {
		System.out.println(integer);
	}
	public static void printInfo(double d) {
		System.out.println(d);
	}
	public static void printInfo(char c) {
		System.out.println(c);
	}
	public static void printInfo(boolean b) {
		System.out.println(b);
	}
	public static void printInfo(float f) {
		System.out.println(f);
	}
		
}
