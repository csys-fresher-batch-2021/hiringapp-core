package in.chainsys.exception;

public class UtilException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8677959836483096367L;

	/**
	 * exception to be thrown in service class
	 * 
	 * @param message the message to be thrown
	 */

	public UtilException(String message) {
		super(message);
	}

	/**
	 * exception to be thrown in service class with mentioning the type
	 * 
	 * @param e       cached exception type
	 * @param message the message to be thrown
	 */

	public UtilException(Throwable e, String message) {
		super(message, e);
	}

}
