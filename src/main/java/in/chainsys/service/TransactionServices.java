package in.chainsys.service;

<<<<<<< HEAD
=======
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import in.chainsys.dao.BookDAO;
import in.chainsys.dao.MemberDAO;
import in.chainsys.dao.TransactionDAO;
import in.chainsys.exception.FeildShouldNotBeEmptyExceptions;
import in.chainsys.model.Book;
import in.chainsys.model.Member;
import in.chainsys.model.Transaction;
import in.chainsys.validator.FeildValidator;

>>>>>>> 2c06aae1f9aef74f181c166bc077f5d0616e0b52
public class TransactionServices {
	private TransactionServices() {
		//Default Constructor
	}
<<<<<<< HEAD
	public boolean addTransaction(String bookName ,String memberId) {
		boolean transac
=======
	public static boolean addTransaction(String name ,long number) throws FeildShouldNotBeEmptyExceptions, ClassNotFoundException, SQLException {
		TransactionDAO transactionDAO = new TransactionDAO();
		boolean isTransaction =false;
		String bookName = name;
		int transactionId = assignTransactionId();
		int bookId =getBookId(name);
		int memberId=getMemberId(number);
		LocalDate bookTakenDate = LocalDate.now();
		LocalDate bookDueDate = LocalDate.now().plusDays(5);
		String bookReturnedDate ="-";
		String bookStatus ="Not Returned";
		Transaction transaction = new Transaction(transactionId,bookId,memberId,bookName,bookTakenDate,bookDueDate,bookReturnedDate,bookStatus);
		boolean isValid =FeildValidator.isFeildEmptyNotNull(name);
		boolean isValidNumberFormat =FeildValidator.isValidUserIdLength(number)&&FeildValidator.isUserIdEmptyAndNull(number);
		if(isValid && isValidNumberFormat) {
			BookTransaction.bookTransaction(bookId);
		transactionDAO.addTransaction(transaction);
		isTransaction = true;
		}
		return isTransaction;
	}
	public static int assignTransactionId() {
		int size =0;
		TransactionDAO transactionDAO = new TransactionDAO();
		int tableSize = transactionDAO.getTableSize() + 1;
		size= tableSize+ 5000;
		return size;	
	}
	public static int getBookId(String bookName) {
		int bookId=0;
		BookDAO bookDAO = new BookDAO();
		List<Book> individualBook = bookDAO.displayIndividualBookDetails(bookName);
		for (Book book : individualBook) {
			bookId =book.getBookId();
		}
		return bookId;
	}
	public static int getMemberId(long number) {
		int id =0;
		MemberDAO memberDAO = new MemberDAO();
		List<Member> memberList = memberDAO.getIndividualMember(number);
		for (Member member : memberList) {
			id =member.getMmemberId();
		}
		return id;
	}
	/**
	 * This Method Update The Transaction Details
	 * @param bookName
	 * @param memberNumber
	 * @return
	 */
	public static boolean bookReturned( String bookName ,long memberNumber) {
		boolean isReturned = false;
		TransactionDAO transactionDAO = new TransactionDAO();
		int bookId =getBookId(bookName);
		int memberId=getMemberId(memberNumber);
		String status = "Not Returned";
		int getTransactionId =0;
		List<Transaction> reurnTransactionList = transactionDAO.getPaticularBook(memberId, bookId, status);
		for (Transaction transaction : reurnTransactionList) {
			getTransactionId =transaction.getTranscationId();
		}
		LocalDate todayDate = LocalDate.now();
		String returnDate = todayDate.toString();
		System.out.println(returnDate);
		String returnStatus ="Returned";
		boolean isSucess =transactionDAO.updateReturnBookTransaction(getTransactionId, returnDate, returnStatus);
		if(isSucess) {
			isReturned =true;
		}
		return isReturned;
>>>>>>> 2c06aae1f9aef74f181c166bc077f5d0616e0b52
	}
}
