package com.techlabs.test;

public class RuntimeExceptionStackTrace {
	public static void main(String args[]) {
		System.out.println("In main");
		try {
			m1();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void m1() {
		System.out.println("Inside m1");
		m2();
	}

	private static void m2() {
		System.out.println("Inside m2");
		m3();
	}

	private static void m3() {
		System.out.println("Inside m3");
		throw new RuntimeException("Throwing Runtime exception");
	}	
}
