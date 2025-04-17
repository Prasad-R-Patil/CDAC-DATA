package exceptions;

public class DefaultExceptionHandlerExample {

	public static void main(String[] args) {
		int n1, n2, result = 0;	
		try {
			
			n1 = Integer.parseInt(args[0]);
			n2 = Integer.parseInt(args[1]);
			result = n1 / n2;
			System.out.println("Result: " + result);
		}
		
		/*catch(ArithmeticException ex) {
			System.out.println("Enter 2nd number as non-zero");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			//Here reference 'ex' refers to the exception class object that is created by JRE
			System.out.println("Enter at least 2 numbers.");
		}*/
		//The above exception handlers can be defined by using a single 'catch' block
		//This is a feature since Java 1.7
		catch(ArithmeticException | ArrayIndexOutOfBoundsException ex) {
			String message = "Enter at least 2 numbers.";
			if(ex instanceof ArithmeticException)
				message = "Enter 2nd number as non-zero";
			System.out.println(message);
		}
		catch(RuntimeException rx) {
			System.out.println("Catching some runtime exception");
		}
		catch(Exception ex) {
			System.out.println("This is a generic exception");
		}
		catch(Throwable t) {
			System.out.println("Handling throwable");
		}
		//'catch' block of sub type must appear before the 'catch' block of super type.
		
		//Adding a 'finally' block
		finally {
			System.out.println("Thank you!!");
		}

	}

}
