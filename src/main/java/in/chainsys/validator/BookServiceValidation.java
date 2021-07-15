package in.chainsys.validator;

import java.sql.SQLException;
import java.util.List;

import in.chainsys.dao.BookDAO;
import in.chainsys.excepiton.ExistingBookException;
import in.chainsys.model.Book;

public class BookServiceValidation {
	private BookServiceValidation() {
		//default-constructor
	}
	public static  boolean isBookExist(String name) throws ClassNotFoundException, ExistingBookException, SQLException {
		boolean isExist = true;
		BookDAO bookDAO = new BookDAO();
		List<Book> bookList = bookDAO.displayAllBook();
		 for (Book book : bookList) {
			 if(name.equals(book.getBookName())) {
				 throw new ExistingBookException(name +"Book Already Available");
			 }else { 
				 isExist= true;
			 }
		}
		return isExist;
	}
	
}
