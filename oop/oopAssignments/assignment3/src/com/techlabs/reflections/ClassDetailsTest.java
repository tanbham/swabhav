package com.techlabs.reflections;

import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassDetailsTest {
	public static void main(String args[]) throws NoSuchMethodException, SecurityException, ClassNotFoundException{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Type in format java.package.classname");
		String input = s.next();
		Class className = Class.forName(input);
		getDetailsOfClass(className);
		s.close();
	}

	private static void getDetailsOfClass(Class<?> class1) throws NoSuchMethodException, SecurityException {
		System.out.println("The name of class is = " +class1.getCanonicalName());
		System.out.println("The name of constructor is = " +class1.getConstructor());
	
		Method [] methodsOfClass = class1.getMethods();
		System.out.println("Methods of the class are :");
		for (Method method:methodsOfClass) {
			System.out.println(method.getName());
		}
		
		System.out.println("Setters of the class are :");
		for (int i = 0; i < methodsOfClass.length; i++) {
			if (methodsOfClass[i].getName().startsWith("set")) {
				System.out.println(methodsOfClass[i].getName());
			}
		}
		
		System.out.println("Getters of the class are :");
		for (int i = 0; i < methodsOfClass.length; i++) {
			if (methodsOfClass[i].getName().startsWith("get")) {
				System.out.println(methodsOfClass[i].getName());
			}
		}
		
		
	}
}
