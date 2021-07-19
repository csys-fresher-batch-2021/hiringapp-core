package in.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.chainsys.model.Book;
import in.chainsys.util.ConnectionUtil;

public class BookDAO {

	private static final String INSERT_ADD_BOOK_QUERY = "INSERT INTO BOOK_TABLE (Book_Id,Book_Name,Book_Serial_Number,Author,Book_Publications,Year_Of_Publication,no_of_copies,book_availablity_status,book_bay_number,book_shelf_number) values(?,?,?,?,?,?,?,?,?,?)";
	private static final String DISPLAY_ALL_BOOK_QUERY = "SELECT * FROM BOOK_TABLE";
	private static final String DISPLAY_INDIVIDUAL_BOOK_QUERY = "SELECT * FROM book_table where book_name=?";
	private static final String UPDATE_BOOK_QUERY = "UPDATE BOOK_TABLE SET no_of_copies=? WHERE Book_Id =?";


	/**
	 * This Method is to Add book.
	 * 
	 * @param book
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void addBook(Book book) {
		Connection connection = null;
		PreparedStatement pst = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = INSERT_ADD_BOOK_QUERY;
			pst = connection.prepareStatement(sql);
			pst.setInt(1, book.getBookId());
			pst.setString(2, book.getBookName());
			pst.setInt(3, book.getSerialNumber());
			pst.setString(4, book.getAuthor());
			pst.setString(5, book.getBookPublication());
			pst.setString(6, book.getYearOfPublication());
			pst.setInt(7, book.getNumberOfCopies());
			pst.setString(8, book.getBookAvailablityStatus());
			pst.setString(9, book.getBookBay());
			pst.setString(10, book.getBookShelf());
			pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.getMessage();
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(pst, connection);
		}
	}

	/**
	 * This Method calculates the number of rows in the table
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public int tableSize() throws ClassNotFoundException, SQLException {
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		int count = 0;
		try {
			connection = ConnectionUtil.getConnection();
			String str = "select count(*) from book_table";
			pst = connection.prepareStatement(str);
			rs = pst.executeQuery();
			rs.next();
			count = rs.getInt(1);
		} catch (ClassNotFoundException | SQLException e) {
			e.getMessage();
		} finally {
			ConnectionUtil.close(rs, pst, connection);
		}
		return count;
	}

	public List<Book> displayAllBook() throws ClassNotFoundException, SQLException {
		List<Book> allBookDisplay = new ArrayList<>();
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = DISPLAY_ALL_BOOK_QUERY;
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				int bookId = rs.getInt("Book_Id");
				String bookName = rs.getString("Book_Name");
				int bookSerialId = rs.getInt("Book_Serial_Number");
				String author = rs.getString("Author");
				String bookPublications = rs.getString("Book_Publications");
				String yearOfPublicaions = rs.getString("Year_Of_Publication");
				Integer numberOfCopies = rs.getInt("no_of_copies");
				String bookAvailablitystatus = rs.getString("book_availablity_status");
				String bookBayNumber = rs.getString("book_bay_number");
				String bookShelfNumber = rs.getString("book_shelf_number");
				Book book = new Book(bookId, bookName, bookSerialId, author, bookPublications, yearOfPublicaions,
						numberOfCopies, bookAvailablitystatus, bookBayNumber, bookShelfNumber);
				allBookDisplay.add(book);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.getMessage();
		} finally {
			ConnectionUtil.close(rs, pst, connection);
		}
		return allBookDisplay;
	}

	public List<Book> displayIndividualBookDetails(String bookName) {
		List<Book> displayIndividualBook = new ArrayList<>();
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = DISPLAY_INDIVIDUAL_BOOK_QUERY;
			pst = connection.prepareStatement(sql);
			pst.setString(1, bookName);
			rs = pst.executeQuery();
			while (rs.next()) {
				int bookId = rs.getInt("Book_Id");
				String searchBookName = rs.getString("Book_Name");
				int bookSerialId = rs.getInt("Book_Serial_Number");
				String author = rs.getString("Author");
				String bookPublications = rs.getString("Book_Publications");
				String yearOfPublicaions = rs.getString("Year_Of_Publication");
				Integer numberOfCopies = rs.getInt("no_of_copies");
				String bookAvailablitystatus = rs.getString("book_availablity_status");
				String bookBayNumber = rs.getString("book_bay_number");
				String bookShelfNumber = rs.getString("book_shelf_number");
				Book book = new Book(bookId, searchBookName, bookSerialId, author, bookPublications, yearOfPublicaions,
						numberOfCopies, bookAvailablitystatus, bookBayNumber, bookShelfNumber);
				displayIndividualBook.add(book);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.getMessage();
		} finally {
			ConnectionUtil.close(rs, pst, connection);
		}
		return displayIndividualBook;
	}

	public int getCopies(int id) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		int copies =0;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "SELECT no_of_copies FROM book_table WHERE Book_Id=?";
			pst = connection.prepareStatement(sql);
			pst.setInt(1,id);
			rs = pst.executeQuery();
			rs.next();
			 copies = rs.getInt("no_of_copies");
		} catch (ClassNotFoundException | SQLException e) {
			e.getMessage();
		} finally {
			ConnectionUtil.close(rs, pst, connection);
		}
		return copies;
	}
	/**
	 * This method is used to update the copies of book when book is taken 
	 * @param copies
	 * @param bookId
	 */
	public void updateBookTable(int copies, int bookId) {
		Connection connection = null;
		PreparedStatement pst = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = UPDATE_BOOK_QUERY;
			pst = connection.prepareStatement(sql);
			pst.setInt(1, copies);
			pst.setInt(2, bookId);
			pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.getMessage();
		} finally {
			ConnectionUtil.close(pst, connection);
		}
	}
	
}
