package model.test;

import java.util.HashMap;
import java.util.TreeMap;


import model.Student;

public class StudentMapTest {
	public static void main(String args[]) {
		Student s1 = new Student(1,10,"tanmay",8.5);
		Student s2 = new Student(1,10,"swabhav",9.5);
		Student s3 =new Student(10,1,"abc",8.0);
		
		TreeMap<Student,Student> map = new TreeMap<Student,Student>();
		
		map.put(s1, s1);
		map.put(s2, s2);
		map.put(s3, s3);
		
		System.out.println(map.size());
	}
}
