package account.inheritancev2.model;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class AccountJUnitTest {

	Account acc;
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	
	@Test
	public void test_Details_stored_correctly_after_creating_SavingAccount() throws Exception {
			
		acc = new SavingAccount(101,"Tanmay",10000, sdf.parse("02-01-2000"),sdf.parse("09-04-1998"));
		
		assertEquals(101,acc.getAccNo());
		assertEquals("Tanmay", acc.getName());
		assertEquals(10000,(int)acc.getBalance());
		assertEquals(sdf.parse("02-01-2000"),acc.getCreationDate());
		
	}

	@Test
	public void testGetBalance_by_withdrawing_rs2000() {
		if(acc != null) {
			acc.withdraw(2000);
			assertEquals("8000",acc.getBalance());
		}
		
	}

}
