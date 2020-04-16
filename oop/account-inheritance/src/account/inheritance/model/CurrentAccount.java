package account.inheritance.model;

public class CurrentAccount extends Account {

	public CurrentAccount(int accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	@Override
	public void withdraw(double amt) {
		balance  = balance - amt;
	}
}
