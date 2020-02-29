package com.techlabs.circle.test;

import java.lang.reflect.Method;

import com.techlabs.circle.Circle;

public class CircleArrayTest {
	public static void main(String args[]) {
		Circle circles[] = new Circle[5];
		//System.out.println(circles[0]);
		//displayMethodsInfo(Integer.class);
		//displayMethodsInfo(Circle.class);
		//displayMethodsInfo(CircleArrayTest.class);
		System.out.println(new Circle().calculateArea());
	}

	private static void displayMethodsInfo(Class<?> class1) {
		Method [] methodsOfClass = class1.getDeclaredMethods();
		System.out.println("total Methods of class are "+methodsOfClass.length);
		for(Method methods : methodsOfClass) {
			System.out.println(methods.getName());
		}
		System.out.println();
	}	
}
