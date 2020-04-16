package account.inheritancev2.model.test;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;


import account.inheritancev2.model.Account;
import account.inheritancev2.model.CurrentAccount;
import account.inheritancev2.model.SavingAccount;

public class EmployeeTest {
	public static void main(String args[]) throws Exception {
		Account accountHolders[] = new Account[5];
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		accountHolders[0] = new SavingAccount(101,"Tanmay",10000, sdf.parse("02-01-2000"),sdf.parse("09-04-1998"));
		accountHolders[1] = new CurrentAccount(102,"Saloni",5000, sdf.parse("03-02-2001"),sdf.parse("02-03-1990"));
		accountHolders[2] = new CurrentAccount(103,"Rajeev",4000, sdf.parse("04-03-2002"),sdf.parse("03-01-1999"));
		accountHolders[3] = new SavingAccount(104,"Suchita",3000, sdf.parse("05-04-2003"),sdf.parse("03-12-1994"));
		accountHolders[4] = new SavingAccount(105,"Krishna",2000, sdf.parse("06-05-2004"),sdf.parse("08-11-1996"));
	
		//task1
		System.out.println("Rich account holder is "+findRichAccHolder(accountHolders));
		
		//task2
		Account accounts[] = findYoungAccHoldser(accountHolders);
		for(Account ac : accounts) {
			System.out.println(ac.getName());
		}
		
		//task3
		writeAccountToFile(accountHolders);
		
	}

	private static void writeAccountToFile(Account[] accountHolders) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		FileWriter file = new FileWriter("account2.csv");
		file.write("Type"+","+"AccountNumber"+","+"Name"+","+"Balance"+","+"CreationDate"+","+"Age");
		file.append("\n");
		for(Account acc : accountHolders) {
			file.write(acc.getClass().getSimpleName()+","+acc.getAccNo()+","+acc.getName()+","+acc.getBalance()+","+sdf.format(acc.getCreationDate())+","+getAgeFromDateOfBirth(acc.getDateOfBirth()));
			file.append("\n"); 
		}
		file.close();
	}


	private static Account[] findYoungAccHoldser(Account[] accountHolders) {
		Account acc [] = new Account[4];
		int j = 0;
		for(int i = 0 ; i < accountHolders.length ; i++) {
			if(accountHolders[i] != null) {
				Date d = accountHolders[i].getDateOfBirth();
				int age = getAgeFromDateOfBirth(d);
				if(age < 30) {
					acc[j] = accountHolders[i];
					j++;
				}
			}
		}
		return acc;
	}


	private static int getAgeFromDateOfBirth(Date d) {
		Calendar c = Calendar.getInstance();	//get a calendar object
		c.setTime(d);                          //assign date to calendar object
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		LocalDate l1 = LocalDate.of(year, month, date);
		LocalDate now = LocalDate.now();
		Period p = Period.between(l1, now);
		return p.getYears();
	}


	private static Account findRichAccHolder(Account[] accountHolders) {
		Account richAcc = null;
		double max = 0;
		for(int i = 0 ; i < accountHolders.length ; i++) {
			if(accountHolders[i] != null) {
				if(accountHolders[i].getBalance() > max){
					max = accountHolders[i].getBalance();
					richAcc = accountHolders[i];
				}
			}
		}
		return richAcc;
	}


}
