package com.techlabs.reflections;

import java.util.Scanner;

public class ClassDetailsTest {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Type in format java.package.classname");
		String input = s.next();
		
		s.close();
	}
}
