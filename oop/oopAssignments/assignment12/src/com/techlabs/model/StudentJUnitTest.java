package com.techlabs.model;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.Test;

public class StudentJUnitTest {

Student student;
	
	@Before
	public void test_initiliazeProfessorObject() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		student = new Student(101,"Thane",sdf.parse("09-04-1998"),Branch.COMPUTER_SCIENCE);
	}
	
	@Test
	public void test_return_id() {
		int expectedId = 101;
		int actualId =	student.getId();
		
		assertEquals(expectedId,actualId);
	}
	
	@Test
	public void test_return_Address() {
		String expectedAddress = "Thane";
		String actualAddress = student.getAddress();
		
		assertEquals(expectedAddress,actualAddress);
	}
	
	@Test
	public void test_get_month_Of_Birth() {
		int expectedMonth = 3;
		int actualMonth = student.getDob().getMonth();
		System.out.println(actualMonth);
		
		assertEquals(expectedMonth,actualMonth);
	}

}
