package com.techlabs.exceptions;

public class UserDefinedNullStringException extends Exception{
	public UserDefinedNullStringException() {
		super("String is null");
	}
}
