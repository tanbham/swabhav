package com.techlabs.reflections;

import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassDetailsTest {
	public static void main(String args[]) throws NoSuchMethodException, SecurityException {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Type in format java.package.classname");
		String input = s.next();
		
		int indexOfLastDot = input.lastIndexOf(".");
		input = input.substring(indexOfLastDot+1);
		String stringObject = new String(input);
 		getDetailsOfClass(stringObject.class);
		s.close();
	}

	private static void getDetailsOfClass(Class<?> class1) throws NoSuchMethodException, SecurityException {
		System.out.println("The name of class is = " +class1.getCanonicalName());
		System.out.println("The name of constructor is = " +class1.getConstructor());
	
		Method [] methods1 = class1.;
		System.out.println("Methods of the class are :");
		for (Method method:methods1) {
			System.out.println(method.getName());
		}
		
		
	}
}
