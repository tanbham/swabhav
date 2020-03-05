package com.techlabs.thisfile;

public class ThisTest {
	public static void main(String args[]) {
		
		UseOfThis obj1 = new UseOfThis("calling overloaded constrctor"); 
		UseOfThis obj2 = new UseOfThis();  //creating an object to initialize default contructor
		
		obj1.setValue(50);
		System.out.println(obj1.getValue());
	}
}
