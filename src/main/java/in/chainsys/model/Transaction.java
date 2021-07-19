package in.chainsys.model;

<<<<<<< HEAD
import java.sql.Date;
=======
>>>>>>> 2c06aae1f9aef74f181c166bc077f5d0616e0b52
import java.time.LocalDate;

public class Transaction {
	private  int transcationId;
	private int memberId;
	private int bookId;
	private String bookName;
	private LocalDate bookTakenDate;
	private LocalDate bookDueDate;
<<<<<<< HEAD
	private LocalDate bookreturnDate;
=======
	private String bookreturnDate;
>>>>>>> 2c06aae1f9aef74f181c166bc077f5d0616e0b52
	private String bookStatus;
	public int getTranscationId() {
		return transcationId;
	}
	public void setTranscationId(int transcationId) {
		this.transcationId = transcationId;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public LocalDate getBookTakenDate() {
		return bookTakenDate;
	}
	public void setBookTakenDate(LocalDate bookTakenDate) {
		this.bookTakenDate = bookTakenDate;
	}
	public LocalDate getBookDueDate() {
		return bookDueDate;
	}
	public void setBookDueDate(LocalDate bookDueDate) {
		this.bookDueDate = bookDueDate;
	}
<<<<<<< HEAD
	public LocalDate getBookreturnDate() {
		return bookreturnDate;
	}
	public void setBookreturnDate(LocalDate bookreturnDate) {
=======
	public String getBookreturnDate() {
		return bookreturnDate;
	}
	public void setBookreturnDate(String bookreturnDate) {
>>>>>>> 2c06aae1f9aef74f181c166bc077f5d0616e0b52
		this.bookreturnDate = bookreturnDate;
	}
	public String getBookStatus() {
		return bookStatus;
	}
	public void setBookStatus(String bookStatus) {
		this.bookStatus = bookStatus;
	}
	public Transaction(int transcationId, int memberId, int bookId, String bookName, LocalDate bookTakenDate,
<<<<<<< HEAD
			LocalDate bookDueDate, LocalDate bookReturnedDate, String bookStatus) {
=======
			LocalDate bookDueDate, String bookReturnedDate, String bookStatus) {
>>>>>>> 2c06aae1f9aef74f181c166bc077f5d0616e0b52
		super();
		this.transcationId = transcationId;
		this.memberId = memberId;
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookTakenDate = bookTakenDate;
		this.bookDueDate = bookDueDate;
		this.bookreturnDate = bookReturnedDate;
		this.bookStatus = bookStatus;
	}
	@Override
	public String toString() {
		return "Transaction [transcationId=" + transcationId + ", memberId=" + memberId + ", bookId=" + bookId
				+ ", bookName=" + bookName + ", bookTakenDate=" + bookTakenDate + ", bookDueDate=" + bookDueDate
				+ ", bookreturnDate=" + bookreturnDate + ", bookStatus=" + bookStatus + "]";
	}
	
	
}
