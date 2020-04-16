package account.inheritance.model;

public abstract class Account {
	
	private String name;
	private int accNo;
	protected double balance;
	
	public Account(int accNo , String name , double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
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
}
