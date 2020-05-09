package com.techlabs.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class Professor extends Person {
	private Date dateOfJoining;
	private final static int BASIC_SALARY = 10000;
	private final static int MIN_YEARS_OF_SERVICE = 5;
	
	public Professor(int id, String address , Date dob , Date dateOfJoining) {
		super(id,address,dob);
		this.dateOfJoining = dateOfJoining;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	
	public int getSalary() {
		int numberOfServiceYears = getServiceYearsFromDateOfJoining(dateOfJoining);
		if(numberOfServiceYears < MIN_YEARS_OF_SERVICE) {
			return BASIC_SALARY;
		}
		else {
			return BASIC_SALARY * numberOfServiceYears;
		}
	}
	
	private static int getServiceYearsFromDateOfJoining(Date d) {
		Calendar c = Calendar.getInstance();	//get a calendar object
		c.setTime(d);                          //assign date to calendar object
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		LocalDate l1 = LocalDate.of(year, month, date);
		LocalDate now = LocalDate.now();
		Period p = Period.between(l1, now);
		return p.getYears();
	}

}
