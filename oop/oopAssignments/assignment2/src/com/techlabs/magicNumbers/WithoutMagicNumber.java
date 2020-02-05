package com.techlabs.magicNumbers;

public class WithoutMagicNumber {
	public static void main(String args[]) {
		String Password = "tanmay@234";
		if(Password.length() > 7) {  //using 7 or any number directly is not a good habit in coding
			System.out.println("Invalid Password");
		}
		else {
			System.out.println("Valid Password");
		}
	}
}
