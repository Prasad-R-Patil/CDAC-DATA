package language_essentials.lambda;

public class SimpleLambdaExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Single Expression Lambda
		Printable prn = () -> System.out.println("Welcome");
		Printable prn2 = () -> System.out.println("Hello");
		
		//Blocked Lambda
		Printable prn3 = () -> {
			System.out.println("Good Morning");
			System.out.println("Good Afternoon");
		};
		
		prn.print();
		prn2.print();
		prn3.print();

	}

}
