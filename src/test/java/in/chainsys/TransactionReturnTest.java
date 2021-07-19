package in.chainsys;

import static org.junit.Assert.*;

import org.junit.Test;

import in.chainsys.service.TransactionServices;

public class TransactionReturnTest {

	@Test
	public void bookReturnTest() {
		String bookName ="Publish News Letter";
		long memberNumber =9080808088l;
		boolean bookReturned = TransactionServices.bookReturned(bookName ,memberNumber);
		assertTrue(bookReturned);
	}

}

