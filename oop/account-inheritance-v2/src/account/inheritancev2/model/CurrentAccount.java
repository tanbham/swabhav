package account.inheritancev2.model;

import java.util.Date;

public class CurrentAccount extends Account {

	public CurrentAccount(int accNo, String name, double balance ,Date creationDate , Date dateOfBirth) {
		super(accNo, name, balance , creationDate , dateOfBirth);
	}

	@Override
	public void withdraw(double amt) {
		balance  = balance - amt;
	}
}
