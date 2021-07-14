package in.chainsys;

import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Test;

import in.chainsys.excepiton.ExistingBookException;
import in.chainsys.service.AddBookService;

public class AddBookTest {

	@Test
	public void addBookTest() throws ClassNotFoundException, SQLException, ExistingBookException {
		String name = "Client Server Computing";
		String author = "lalit kumar";
		String bookPublications = "Sun India";
		String yearOfPublicaion ="1918";
		int numberOfCopies= 20;
		String availablity = "YES";
		String bookBayNumber="C7";
		String bookShelfNumber="2C";
		boolean isBookAdded = AddBookService.addBooks(name,author,bookPublications,yearOfPublicaion,numberOfCopies,availablity,bookBayNumber,bookShelfNumber);
		assertTrue(isBookAdded);
		
	}

}
