package com.techlabs.model.test;

import com.techlabs.model.Student;

public class StudentTest {
	public static void main(String args[]) {
		Student s1 = new Student(22,"Tanmay",8.5f);
		System.out.println(s1.getCount());
		
		Student s2 = new Student(22,"Tanmay",8.5f);
		System.out.println(s1.getCount());
		
		Student s3 = new Student(22,"Tanmay");
		System.out.println(s1.getCount());
	}
}
