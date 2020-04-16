package account.inheritancev2.model;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class AccountJUnitTest {

	Account acc;
	@Test
	public void testGetName() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		acc = new SavingAccount(101,"Tanmay",10000, sdf.parse("02-01-2000"),sdf.parse("09-04-1998"));
		assertEquals("Tanmay", acc.getName());
	}

	@Test
	public void testGetAccNo() {
		if(acc != null) {
			assertEquals("101",acc.getAccNo());
		}
	}

	@Test
	public void testGetBalance() {
		if(acc != null) {
			acc.withdraw(2000);
			assertEquals("8000",acc.getBalance());
		}
		
	}

}
