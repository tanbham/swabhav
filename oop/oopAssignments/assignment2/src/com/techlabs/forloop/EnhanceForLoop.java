package com.techlabs.forloop;

public class EnhanceForLoop {
	public static void main(String args[]) {
		String names[] = {"tanmay","Saloni","Rajeev","Suchita"};
		
		System.out.println("Printing all the names");
		for(String get : names) {
			System.out.println(get);
		}
		System.out.println("Cannot print in reverse order by enhance for loop");
	}
}
