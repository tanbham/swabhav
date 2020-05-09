package com.techlabs.exceptions.test;

import java.util.Scanner;

import com.techlabs.exceptions.UserDefinedNullStringException;

public class TestUserDefinedNullStringException {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		try {
			printInfo(sc.nextLine());
		} catch (UserDefinedNullStringException e) {
			System.out.println(e);
		}
	}

	private static void printInfo(String nextLine) throws UserDefinedNullStringException {
		if(nextLine.equals("")) {
			throw new UserDefinedNullStringException();
		}
		
	}
}
