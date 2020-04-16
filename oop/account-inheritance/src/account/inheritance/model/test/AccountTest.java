package account.inheritance.model.test;

import account.inheritance.model.Account;
import account.inheritance.model.SavingAccount;

public class AccountTest {
	public static void main(String args[]) {
		Account acc1 = new SavingAccount(101,"Tanmay",5000);
		acc1.withdraw(200);
		
		printInfo(acc1);
	}

	private static void printInfo(Account acc) {
		System.out.println(acc.getAccNo()+" = Account Number");
		System.out.println(acc.getBalance()+" = Balance");
		System.out.println(acc.getName()+" = Name");
		
	}
}
