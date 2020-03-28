package com.techlabs.model.test;

import com.techlabs.model.Student;

public class StudentTest3 {
	public  static void main(String args[]) {
		Student s1 = new Student(22,"Tanmay",8.5f);

		Student s2 = new Student(22,"Saloni",9.23f);
		
		Student s3 = new Student(22,"Raju");
		
		System.out.println("Head count = "+Student.headCount());
	}
}
