package com.techlabs.account;

public class InsufficientException extends RuntimeException{
	public InsufficientException(Account acc) {
		super("Account number "+acc.getAccNo() +" has balance of Rs "+acc.getBalance()+" and cannot withdraw more than Rs "+(acc.getBalance()-acc.getMinBalance())+" since the minimum balance needed in account Rs "+acc.getMinBalance());
	}
}
