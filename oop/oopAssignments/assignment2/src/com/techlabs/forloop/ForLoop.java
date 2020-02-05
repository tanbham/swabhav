package com.techlabs.forloop;

public class ForLoop {
	public static void main(String args[]) {
		String names[] = {"tanmay","Saloni","Rajeev","Suchita"};
		int sizeOfArray = names.length;
		
		System.out.println("Get names");
		for(int get=0 ; get<sizeOfArray ; get++) {
			System.out.println(names[get]);
		}
		
		System.out.println("Get names in reverse order");
		for(int get=(sizeOfArray)-1 ; get>=0 ; get--) {
			System.out.println(names[get]);
		}
	}
}
