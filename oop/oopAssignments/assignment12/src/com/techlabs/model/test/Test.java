package com.techlabs.model.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.techlabs.model.Branch;
import com.techlabs.model.Professor;
import com.techlabs.model.Student;

public class Test {
	public static void main(String args[]) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Student tanmay = new Student(101,"Thane",sdf.parse("09-04-1998"),Branch.COMPUTER_SCIENCE);
		Professor swabhav = new Professor(102,"Andheri",sdf.parse("09-04-1964"),sdf.parse("09-04-1998"));
		
		printStudentInfo(tanmay);
		printTeacherInfo(swabhav);
		
	}

	private static void printTeacherInfo(Professor teacher) {
		System.out.println("ID is = "+teacher.getId()+" Address is = "+teacher.getAddress()+" DOB = "+ teacher.getDob()+" Date of Joining = "+teacher.getDateOfJoining());
		System.out.println("Salary = "+teacher.getSalary()+" per annum");
		System.out.println();
	}

	private static void printStudentInfo(Student student) {
		System.out.println("ID is = "+student.getId()+" Address is = "+student.getAddress()+" DOB = "+student.getDob());
		System.out.println();
	}
}
  