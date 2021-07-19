package in.chainsys;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import in.chainsys.exception.FeildShouldNotBeEmptyExceptions;
import in.chainsys.service.TransactionServices;

public class TransactionTest {

	@Test
	public void TransactionAddTest() throws FeildShouldNotBeEmptyExceptions, ClassNotFoundException, SQLException {
		String bookName ="Publish News Letter";
		long number =9080808088l;
		boolean isSucess =TransactionServices.addTransaction(bookName,number);
		assertTrue(isSucess);
	}

}
