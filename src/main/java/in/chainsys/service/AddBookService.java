package in.chainsys.service;

import java.sql.SQLException;
import in.chainsys.dao.BookDAO;
import in.chainsys.excepiton.ExistingBookException;
import in.chainsys.model.Book;
import in.chainsys.validator.BookServiceValidation;

public class AddBookService {
	
	private static BookDAO bookDAO = new BookDAO();
	
	public static boolean addBooks( String bookName,String author, String bookPublication,String yearOfPublication,int numberOfCopies,String bookAvailablityStatus,String bookBayNumber,String bookShelfNumber ) throws SQLException, ClassNotFoundException, ExistingBookException{
		boolean isAdded = false;
		int bookId = bookIdAssigner();
		int serailNumber=bookSerailIdAssigner();
		String name = bookName;
		String bookAuthor = author;
		String publication =bookPublication;
		String yearOfPubliction = yearOfPublication;
		int copies= numberOfCopies;
		String availablityStatus = bookAvailablityStatus;
		String bayNumber =bookBayNumber;
		String shelfNumber = bookShelfNumber;
		boolean bookValid = BookServiceValidation.isBookExist(name);
		if(bookValid) {
			Book book = new Book(bookId,name,serailNumber,bookAuthor,publication,yearOfPubliction,copies,availablityStatus,bayNumber,shelfNumber);
			bookDAO.addBook(book);
			isAdded=true;
		}
		else {
			isAdded=false;
		}
		return isAdded;
	}
	public static int bookIdAssigner() throws SQLException{
		int tableSize=0;
		try {
			tableSize=bookDAO.tableSize() + 1;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return tableSize;
	}
	public static int bookSerailIdAssigner() {
		int serialNumber=0;
		try {
			int size =bookDAO.tableSize();
			serialNumber=100+size;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return serialNumber;
		
	}
	
}
