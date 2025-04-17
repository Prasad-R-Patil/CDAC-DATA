package exceptions;

public class ThrowExample {
	private static String greetUser(String name, String message) {
		//This method greets the user with some message if the name contains at least 5 characters
		//Otherwise fires an exception RuntimeException
		int length = name.length();
		if(length < 5) {
			RuntimeException rx = new RuntimeException("The name length is invalid...");
			throw rx;
		}
		String greeting = message + " " + name;
		return greeting;
	}
	public static void main(String[] args) {
		try {
			String msg = greetUser("Jack", "Welcome");
			System.out.println(msg);
		}
		catch(RuntimeException rxe) {
			String errorMessage = rxe.getMessage();
			System.out.println(errorMessage);
		}

	}

}
