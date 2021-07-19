package in.chainsys;

import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Test;

import in.chainsys.exception.ExistingBookException;
import in.chainsys.service.AddBookService;

public class AddBookTest {

	@Test
	public void addBookTest() throws ClassNotFoundException, SQLException, ExistingBookException {
		String name = "Computer Networks";
		String author = "Sharad Kumar";
		String bookPublications = "Sun India";
		String yearOfPublicaion ="2010";
		int numberOfCopies= 20;
		String availablity = "YES";
		String bookBayNumber="E3";
		String bookShelfNumber="1E";
		boolean isBookAdded = AddBookService.addBooks(name,author,bookPublications,yearOfPublicaion,numberOfCopies,availablity,bookBayNumber,bookShelfNumber);
		assertTrue(isBookAdded);	
	}

}
