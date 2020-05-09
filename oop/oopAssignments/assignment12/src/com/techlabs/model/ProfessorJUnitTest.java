package com.techlabs.model;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.Test;

public class ProfessorJUnitTest {

	Professor teacher;
	
	@Before
	public void test_initiliazeProfessorObject() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		teacher = new Professor(102,"Andheri",sdf.parse("09-04-1964"),sdf.parse("09-04-1998"));
	}
	
	@Test
	public void test_return_id() {
		int expectedId = 102;
		int actualId =	teacher.getId();
		
		assertEquals(expectedId,actualId);
	}
	
	@Test
	public void test_return_Address() {
		String expectedAddress = "Andheri";
		String actualAddress = teacher.getAddress();
		
		assertEquals(expectedAddress,actualAddress);
	}
	
	@Test
	public void test_return_salary() {
		int expectedSalary = 220000;
		int actualSalary = teacher.getSalary();
		assertEquals(expectedSalary,actualSalary);
	}

}
