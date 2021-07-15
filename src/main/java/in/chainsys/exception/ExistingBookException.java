package in.chainsys.exception;

public class ExistingBookException extends Exception {

	private static final long serialVersionUID = 1L;

	public ExistingBookException(String message) {
		super(message);
	}
}
