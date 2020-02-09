package com.techlabs.boxing;
//converting object of wrapper class into a primitive data types
public class UnboxingTest {
	public static void main(String args[]) {
		int integerValue = 1234;
		byte byteValue = 1;	
		float floatValue = 20.25f;	
		char character = 'a';		
		double dvalue = 255.25;
		
		Integer integerObj = new Integer(integerValue);
		Byte byteObj = new Byte(byteValue);
		Float floatObj = new Float(floatValue);
		Character charObj = new Character(character);
		Double doubObj = new Double(dvalue);
		
		objectsToPrimtives(integerObj,byteObj,floatObj,charObj,doubObj);
	}

	private static void objectsToPrimtives(Integer integerObj, Byte byteObj, Float floatObj, Character charObj, Double doubObj) {
		int integerValue = integerObj;
		byte byteValue = byteObj;	
		float floatValue = floatObj;	
		char character = charObj;		
		double dvalue = doubObj;
		
		System.out.println("Integer object value = "+integerValue);
		System.out.println("Integer object value = "+byteValue);
		System.out.println("Integer object value = "+floatValue);
		System.out.println("Integer object value = "+character);
		System.out.println("Integer object value = "+dvalue);
	}
}
