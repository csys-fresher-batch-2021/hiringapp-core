package in.chainsys.model;

public class Book {
	private int bookId;
	private String bookName;
	private int serialNumber;
	private String author;
	private String bookPublication;
	private String yearOfPublication;
	private int numberOfCopies;
	private String bookAvailablityStatus;
	private String bookBay;
	private String bookShelf;
	
	public Book(int bookId, String bookName, int serialNumber, String author, String bookPublication,
			String yearOfPublication, int numberOfCopies, String bookAvailablityStatus, String bookBay,
			String bookShelf) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.serialNumber = serialNumber;
		this.author = author;
		this.bookPublication = bookPublication;
		this.yearOfPublication = yearOfPublication;
		this.numberOfCopies = numberOfCopies;
		this.bookAvailablityStatus = bookAvailablityStatus;
		this.bookBay = bookBay;
		this.bookShelf = bookShelf;
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", serialNumber=" + serialNumber + ", author="
				+ author + ", bookPublication=" + bookPublication + ", yearOfPublication=" + yearOfPublication
				+ ", numberOfCopies=" + numberOfCopies + ", bookAvailablityStatus=" + bookAvailablityStatus
				+ ", bookBay=" + bookBay + ", bookShelf=" + bookShelf + "]";
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
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBookPublication() {
		return bookPublication;
	}
	public void setBookPublication(String bookPublication) {
		this.bookPublication = bookPublication;
	}
	public String getYearOfPublication() {
		return yearOfPublication;
	}
	public void setYearOfPublication(String yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	public String getBookAvailablityStatus() {
		return bookAvailablityStatus;
	}
	public void setBookAvailablityStatus(String bookAvailablityStatus) {
		this.bookAvailablityStatus = bookAvailablityStatus;
	}
	public String getBookBay() {
		return bookBay;
	}
	public void setBookBay(String bookBay) {
		this.bookBay = bookBay;
	}
	public String getBookShelf() {
		return bookShelf;
	}
	public void setBookShelf(String bookShelf) {
		this.bookShelf = bookShelf;
	}
	
	
}
