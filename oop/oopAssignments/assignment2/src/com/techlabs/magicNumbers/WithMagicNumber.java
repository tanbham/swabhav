package com.techlabs.magicNumbers;

public class WithMagicNumber {
	public static void main(String args[]) {
		String Password = "tanmay@234";
		final int MAX_PASSWORD_SIZE = 7;             //magic number
		if(Password.length() > MAX_PASSWORD_SIZE) {  //using 10 or any number directly is not a good habit in coding
			System.out.println("Invalid Password");
		}
		else {
			System.out.println("Valid Password");
		}
	}
}
