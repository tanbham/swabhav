package account.inheritance.model;

public class SavingAccount extends Account {

	public SavingAccount(int accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	@Override
	public void withdraw(double amt) {
		balance  = balance - amt;	
	}

}
