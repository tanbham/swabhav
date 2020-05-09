package com.techlabs.exceptions;

public class UserDefinedArithmeticException extends RuntimeException{
	public UserDefinedArithmeticException() {
		super("Divide by 0 exception occured");
	}
}
