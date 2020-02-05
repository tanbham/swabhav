package com.techlabs.stringimmutable;

public class ImmutableString {
	public static void main(String args[]) {
		String name = "Tanmay";
		name.concat("Bhambure");
		System.out.println("Printing only Tanmay bcs Strings are unmodifiable");		
		System.out.println(name); 
		
		System.out.println("New object is created and we are explicitly assigning it to reference variable name");
		name = name.concat("Bhambure");
		System.out.println(name); 
	}
}
