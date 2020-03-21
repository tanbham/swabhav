package com.techlabs.model.test;

public class TestException {
	public static void main(String args[]) throws Exception {
		try {
			System.out.print("t");
			TestException.doRisk("es");
			System.out.print("o");
		}
		catch(Exception ex){
			System.out.print("a");
		}
		finally {
			System.out.print("w");
		}
		System.out.print("s");
	}
	
	public static void doRisk(String s) throws Exception {
		System.out.print("h");
		if("yes".equals(s)) {
			throw new Exception();
		}
		System.out.print("r");
	}
}