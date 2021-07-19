package in.chainsys.exception;

public class ValidationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6440136833623375069L;

	/**
	 * exception to be thrown in service class
	 * 
	 * @param message the message to be thrown
	 */

	public ValidationException(String message) {
		super(message);
	}

	/**
	 * exception to be thrown in service class with mentioning the type
	 * 
	 * @param e       cached exception type
	 * @param message the message to be thrown
	 */

	public ValidationException(Throwable e, String message) {
		super(message, e);
	}

}