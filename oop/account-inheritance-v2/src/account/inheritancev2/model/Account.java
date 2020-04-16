package account.inheritancev2.model;

import java.util.Date;

public abstract class Account {
	
	private String name;
	private int accNo;
	protected double balance;
	private Date creationDate;
	private Date dateOfBirth;
	
	public Account(int accNo , String name , double balance , Date creationDate , Date dateOfBirth) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.creationDate = creationDate;
		this.dateOfBirth = dateOfBirth;
	}
	
	public abstract void withdraw(double amt);
	
	public String getName() {
		return name;
	}
	
	public int getAccNo() {
		return accNo;
	}
	
	public double getBalance() {
		return balance;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}
}
