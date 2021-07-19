package in.chainsys.service;

import java.sql.SQLException;

import in.chainsys.dao.BookDAO;

public class BookTransaction {
	private BookTransaction() {
		//defaultConstructor
	}
	/**
	 * This Method is called while the transaction is done and reduces the number of copies from the table 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void bookTransaction (int id) throws ClassNotFoundException, SQLException {
		BookDAO bookDAO = new BookDAO();
		int intialCopies =bookDAO.getCopies(id);
		int finalCopies=intialCopies - 1;
		bookDAO.updateBookTable(finalCopies, id);
	}
	public static void returnBookTransaction(int id) throws ClassNotFoundException, SQLException {
		BookDAO bookDAO = new BookDAO();
		int intialCopies =bookDAO.getCopies(id);
		int finalCopies=intialCopies + 1;
		bookDAO.updateBookTable(finalCopies, id);
	}
}
