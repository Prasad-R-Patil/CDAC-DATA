package exceptions;

public class WithoutExceptionHandlerExample {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int result = n1 + n2;
		System.out.println("Result: " + result);

	}

}
