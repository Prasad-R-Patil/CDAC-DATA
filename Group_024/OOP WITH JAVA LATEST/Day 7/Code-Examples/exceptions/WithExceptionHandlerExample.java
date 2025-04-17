package exceptions;

public class WithExceptionHandlerExample {

	public static void main(String[] args) {
		int n1, n2, result = 0;	
		try {
			
			n1 = Integer.parseInt(args[0]);
			n2 = Integer.parseInt(args[1]);
			result = n1 + n2;
			System.out.println("Result: " + result);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			//Here reference 'ex' refers to the exception class object that is created by JRE
			System.out.println("Enter at least 2 numbers.");
		}
		

	}

}
