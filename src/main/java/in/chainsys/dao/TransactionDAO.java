package in.chainsys.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import in.chainsys.model.Transaction;

import in.chainsys.util.ConnectionUtil;

public class TransactionDAO {
<<<<<<< HEAD
	
	private static final String DISPLAY_ALL_TRANSCATION ="SELECT *FROM libraryTransaction";
	private static final String ADD_TRANSACTION = "INSERT INTO libraryTransaction(transcationId,memberId,bookId,bookName,bookTakenDate,bookDueDate,bookReturnedDate,bookstatus)values(?,?,?,?,?,?,?,?)";
	
	/**
	 * this method add the the transaction details
	 * @param transaction
	 */
	public void addTransaction(Transaction transaction) {
		Connection connection =null;
		PreparedStatement pst =null;
		try {
			connection=ConnectionUtil.getConnection();
			String sql =ADD_TRANSACTION;
			pst =connection.prepareStatement(sql);
			pst.setInt(1, transaction.getTranscationId());
			pst.setInt(2, transaction.getMemberId());
			pst.setInt(3, transaction.getBookId());
			pst.setString(4,transaction.getBookName());
			pst.setObject(5, transaction.getBookTakenDate());
			pst.setObject(6,transaction.getBookDueDate());
			pst.setObject(7,transaction.getBookreturnDate());
			pst.setString(8,transaction.getBookStatus());
			pst.executeQuery();
		}catch(ClassNotFoundException|SQLException e) {
			e.getMessage();
		}finally {
			ConnectionUtil.close(pst, connection);
		}
	}
	/**
	 *  This Method Calculate The size of the row
	 * @return
	 */
	public int getTableSize() {
		int count =0;
		Connection connection = null;
		PreparedStatement pst =null;
=======

	private static final String DISPLAY_ALL_TRANSCATION = "SELECT *FROM libraryTransaction";
	private static final String ADD_TRANSACTION = "INSERT INTO libraryTransaction(transcationId,memberId,bookId,bookName,bookTakenDate,bookDueDate,bookReturnedDate,bookstatus)values(?,?,?,?,?,?,?,?)";
	private static final String GET_PATICULAR_TRANSACTION = "SELECT * FROM libraryTransaction WHERE memberId=? AND bookId=? AND bookstatus=?";
	private static final String UPDATE_TRANSACTION_TABLE = "UPDATE libraryTransaction SET bookstatus=?,bookReturnedDate=? WHERE transcationId=?";

	/**
	 * this method add the the transaction details
	 * 
	 * @param transaction
	 */
	public void addTransaction(Transaction transaction) {
		Connection connection = null;
		PreparedStatement pst = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = ADD_TRANSACTION;
			pst = connection.prepareStatement(sql);
			pst.setInt(1, transaction.getTranscationId());
			pst.setInt(2, transaction.getBookId());
			pst.setInt(3, transaction.getMemberId());
			pst.setString(4, transaction.getBookName());
			pst.setObject(5, transaction.getBookTakenDate());
			pst.setObject(6, transaction.getBookDueDate());
			pst.setObject(7, transaction.getBookreturnDate());
			pst.setString(8, transaction.getBookStatus());
			pst.executeQuery();
		} catch (ClassNotFoundException | SQLException e) {
			e.getMessage();
		} finally {
			ConnectionUtil.close(pst, connection);
		}
	}

	/**
	 * This Method Calculate The size of the row
	 * 
	 * @return
	 */
	public int getTableSize() {
		int count = 0;
		Connection connection = null;
		PreparedStatement pst = null;
>>>>>>> 2c06aae1f9aef74f181c166bc077f5d0616e0b52
		ResultSet rs = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "select count (*) from libraryTransaction";
			pst = connection.prepareStatement(sql);
<<<<<<< HEAD
			rs=pst.executeQuery();
			rs.next();
			count= rs.getInt(1);
			}catch (ClassNotFoundException|SQLException e) {
				e.getMessage();
			}finally {
				ConnectionUtil.close(rs, pst, connection);
		}
		return count;
	}
	
	public List<Transaction> getAllTransaction(){
		List<Transaction> transcationList = new ArrayList<>();
		Connection connection = null;
		PreparedStatement pst =null;
		ResultSet rs =null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql =DISPLAY_ALL_TRANSCATION;
			pst = connection.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()) {
				int transactionId = rs.getInt("transcationId");
				int memberId = rs.getInt("memberId");
				int bookId =rs.getInt("bookId");
				String bookName =rs.getString("bookName");
				Date sqlDate =rs.getDate("bookTakenDate");
				LocalDate takenDate = sqlDate.toLocalDate();
				Date sqlBookDueDate = rs.getDate("bookDueDate");
				LocalDate dueDate = sqlBookDueDate.toLocalDate();
				Date sqlbookReturnedDate = rs.getDate("bookReturnedDate");
				LocalDate bookReturnedDate =sqlbookReturnedDate.toLocalDate();
				String bookStatus = rs.getString("bookstatus");
				Transaction transaction = new Transaction(transactionId,memberId,bookId,bookName,takenDate,dueDate,bookReturnedDate,bookStatus);
				transcationList.add(transaction);
			}
			}catch(ClassNotFoundException |SQLException e) {
				e.getMessage();
			}finally {
				ConnectionUtil.close(rs, pst, connection);
			}
		return transcationList;
	}
	
=======
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

	public List<Transaction> getAllTransaction() {
		List<Transaction> transcationList = new ArrayList<>();
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = DISPLAY_ALL_TRANSCATION;
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				int transactionId = rs.getInt("transcationId");
				int memberId = rs.getInt("memberId");
				int bookId = rs.getInt("bookId");
				String bookName = rs.getString("bookName");
				Date sqlDate = rs.getDate("bookTakenDate");
				LocalDate takenDate = sqlDate.toLocalDate();
				Date sqlBookDueDate = rs.getDate("bookDueDate");
				LocalDate dueDate = sqlBookDueDate.toLocalDate();
				String bookReturnedDate = rs.getString("bookReturnedDate");
				String bookStatus = rs.getString("bookstatus");
				Transaction transaction = new Transaction(transactionId, memberId, bookId, bookName, takenDate, dueDate,
						bookReturnedDate, bookStatus);
				transcationList.add(transaction);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.getMessage();
		} finally {
			ConnectionUtil.close(rs, pst, connection);
		}
		return transcationList;
	}

	public List<Transaction> getPaticularBook(int memberId, int bookId ,String status) {
		List<Transaction> getTransactionBook = new ArrayList<>();
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = GET_PATICULAR_TRANSACTION;
			pst = connection.prepareStatement(sql);
			pst.setInt(1, memberId);
			pst.setInt(2, bookId);
			pst.setString(3,status);
			rs = pst.executeQuery();
			while (rs.next()) {
				int transactionId = rs.getInt("transcationId");
				int id = rs.getInt("memberId");
				int bookid = rs.getInt("bookId");
				String bookName = rs.getString("bookName");
				Date sqlDate = rs.getDate("bookTakenDate");
				LocalDate takenDate = sqlDate.toLocalDate();
				Date sqlBookDueDate = rs.getDate("bookDueDate");
				LocalDate dueDate = sqlBookDueDate.toLocalDate();
				String bookReturnedDate = rs.getString("bookReturnedDate");
				String bookStatus = rs.getString("bookstatus");
				Transaction transaction = new Transaction(transactionId, id, bookid, bookName, takenDate, dueDate,
						bookReturnedDate, bookStatus);
				getTransactionBook.add(transaction);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.getMessage();
		} finally {
			ConnectionUtil.close(rs, pst, connection);
		}
		return getTransactionBook;
	}

	public boolean  updateReturnBookTransaction(int transactionId, String returDate, String status) {
		boolean isReturned = true;
		Connection connection = null;
		PreparedStatement pst = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = UPDATE_TRANSACTION_TABLE;
			pst = connection.prepareStatement(sql);
			pst.setString(1, status);
			pst.setString(2, returDate);
			pst.setInt(3, transactionId);
			pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
			isReturned=false;
		} finally {
			ConnectionUtil.close(pst, connection);
		}
		return isReturned;
	}
>>>>>>> 2c06aae1f9aef74f181c166bc077f5d0616e0b52
}
