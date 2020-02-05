package com.techlabs.callbyvalue;

public class CallByValue {
		
	public static void main(String args[]) {
		Student s = new Student("JON");
		modifyFail(s);	 //copy of reference variable is created and passed to the function
		System.out.println(s.getName());
		
		modifySuccess(s);
		System.out.println(s.getName());	
	}
	
	
	public static void modifyFail(Student s) {
		s = new Student("PETER");    //new object is created and we are pointing the local copy of the reference to a new object in heap
	}
	
	public static void modifySuccess(Student s) {
		s.setName("TANMAY");         //we are pointing the local copy of the reference to the same object in heap
	}
	
}
