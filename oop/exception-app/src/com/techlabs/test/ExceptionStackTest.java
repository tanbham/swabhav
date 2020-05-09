package com.techlabs.test;

public class ExceptionStackTest {
	public static void main(String args[]) {
		System.out.println("In main");
		try{
			m1();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void m1() throws Exception {
		System.out.println("Inside m1");
		m2();
	}

	private static void m2() throws Exception {
		System.out.println("Inside m2");
		m3();
	}

	private static void m3() throws Exception {
		System.out.println("Inside m3");
		throw new Exception("Some fatal Exception");
	}
}
