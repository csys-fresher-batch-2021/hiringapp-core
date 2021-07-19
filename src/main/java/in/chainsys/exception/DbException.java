package in.chainsys.exception;

public class DbException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1437689498154027008L;

	/**
	 * DAOException constructor to throw exception in DAO class
	 * 
	 * @param message the message to be thrown
	 */

	public DbException(String message) {
		super(message);
	}

	/**
	 * DAOException throws exception in DAO class
	 * 
	 * @param message the message to be thrown
	 * @param e       cached exception type
	 * @return
	 */
	public DbException(Throwable e, String message) {
		super(message, e);
	}
}
