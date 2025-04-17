package exceptions;

public class ThrowsExample {
	private static void conductTest() throws Exception {
		//This method instructs the compiler that it may throw an exception: Exception but not
		//willing to handle it. Wants its caller to handle it
	}
	
	private static void doTest() {
		//Invokes conductTest();
		//This method is supposed to handle the exception raised by conductTest and it is handling that
		try {
			conductTest();
		}
		catch(Exception ex) {
			//Some code
		}		
	}	
	private static void performTest() throws Exception {
		//This method is supposed to handle the exception raised by conductTest but it also does not
		//want to handle it. Wants its caller to handle it
		conductTest();
	}
	
	private static void doSimpleTest() throws RuntimeException {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoking doTest()
		doTest();
		//Invoking performTest()
		//Here since performTest() further delegates the responsibility to its caller which is main(),
		//the main() is supposed to handle it else delegate it.
		//Since main() is the entry point, as per the standard practice, it must not add 'throws'
		try {
			performTest();
		}
		catch(Exception ex) {
			//Some code
		}
		
		//Invoking doSimpleTest()
		doSimpleTest();
		//Since this method is capable of firing RuntimeException which is an unchecked exception
		//'throws' does not create any impact

	}

}




