package com.techlabs.basic;

public class ArgumentTest {
	public static void main(String names[]) {
		for(String name : names) {
			System.out.println(name.concat("AurionPro"));
		}
		System.out.println(names);
		System.out.println(names[0]);
		
		for(int i=0 ; i < names.length ; i++) {
			System.out.println(names[i].concat("AurionPro"));
		}
		System.out.println(names);
		System.out.println(names[0]);
		
		String copyArray [] = names;
		for(int i=0 ; i < names.length ; i++) {
			System.out.println(copyArray[i].concat("AurionPro"));
		}
		System.out.println(names);
		System.out.println(copyArray);
		
		copyArray[names.length -1] = "swabhavTechlabs";
		System.out.println(names[names.length -1]);
	}	
}