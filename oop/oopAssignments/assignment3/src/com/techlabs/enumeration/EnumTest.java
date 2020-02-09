package com.techlabs.enumeration;

public class EnumTest {
	public static void main(String args[]) {
		for(Direction s : Direction.values()) {
			System.out.println(s);
		}
		System.out.println(Direction.valueOf("NORTH").ordinal());
	}
}
