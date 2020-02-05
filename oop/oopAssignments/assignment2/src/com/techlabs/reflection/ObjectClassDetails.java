package com.techlabs.reflection;
import java.lang.reflect.Method;


public class ObjectClassDetails {
	public static void main(String args[]) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException{
		System.out.println("Details of Object class are as follows");
		getDetails(Object.class);
		System.out.println();
		System.out.println("Details of String class are as follows");
		getDetails(String.class);
	}
	
	private static <T> void getDetails(Class<T> theClass) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException{
		System.out.println("The name of class is = " +theClass.getClass());
        
		System.out.println("The name of constructor is = " +theClass.getConstructor());
        
		Method [] methods1 = theClass.getMethods();
		System.out.println("Methods of the class are :");
		for (Method method:methods1) {
			System.out.println(method.getName());
		}
		
	}
	
}
