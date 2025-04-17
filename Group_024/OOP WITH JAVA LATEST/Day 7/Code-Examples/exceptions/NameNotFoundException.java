package exceptions;

public class NameNotFoundException extends Exception{
	private String invalidName;
	public NameNotFoundException(String errorMessage, String invalidName) {
		super(errorMessage);
		this.invalidName = invalidName;
	}
	
	@Override
	public String getMessage() {
		String errMessage = super.getMessage();
		String finalMessage = errMessage + ": " + invalidName;
		return finalMessage;
	}
	
	
}
