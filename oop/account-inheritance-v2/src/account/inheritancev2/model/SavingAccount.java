package account.inheritancev2.model;

import java.util.Date;

public class SavingAccount extends Account {

	public SavingAccount(int accNo, String name, double balance,  Date creationDate , Date dateOfBirth) {
		super(accNo, name, balance , creationDate , dateOfBirth);
	}

	@Override
	public void withdraw(double amt) {
		balance  = balance - amt;	
	}
	
}
