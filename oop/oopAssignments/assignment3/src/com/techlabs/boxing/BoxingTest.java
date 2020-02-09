package com.techlabs.boxing;
//conversion of primitive data types to object of their corresponding wrapper classes 
public class BoxingTest {
	public static void main(String args[]) {
		int integerValue = 1234;
		byte byteValue = 1;	
		float floatValue = 20.25f;	
		char character = 'a';		
		double dvalue = 255.25;
		
		primitivesToObjects(integerValue,byteValue,floatValue,character,dvalue);
	}
	
	public static void primitivesToObjects(int integerValue,byte byteValue,float floatValue,char character,double dvalue) {
		Integer integerObj = new Integer(integerValue);
		Byte byteObj = new Byte(byteValue);
		Float floatObj = new Float(floatValue);
		Character charObj = new Character(character);
		Double doubObj = new Double(dvalue);
		
		int i = integerObj.intValue();
		float f =  floatObj.floatValue();
		byte b = byteObj.byteValue();
		char c = charObj.charValue();
		double d = doubObj.doubleValue();
		
		System.out.println("Integer object value = "+i);
		System.out.println("Float object value = "+f);
		System.out.println("Byte object value = "+b);
		System.out.println("Character object value = "+c);
		System.out.println("Double object value = "+d);
	}
	
}
