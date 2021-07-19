package in.chainsys;

import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Test;

import in.chainsys.exception.ExistingBookException;
import in.chainsys.service.AddBookService;

public class AddBookTest {

	@Test
	public void addBookTest() throws ClassNotFoundException, SQLException, ExistingBookException {
		String name = "Mobile Computing";
		String author = "Vinay Kumar";
		String bookPublications = "K Nath";
		String yearOfPublicaion ="1987";
		int numberOfCopies= 20;
		String availablity = "YES";
		String bookBayNumber="D2";
		String bookShelfNumber="3D";
		boolean isBookAdded = AddBookService.addBooks(name,author,bookPublications,yearOfPublicaion,numberOfCopies,availablity,bookBayNumber,bookShelfNumber);
		assertTrue(isBookAdded);	
	}

}
