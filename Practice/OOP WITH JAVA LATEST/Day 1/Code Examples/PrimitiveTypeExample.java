
public class PrimitiveTypeExample {

	public static void main(String[] args) {
		System.out.println("Demonstrating Primitive Types: ");
		int val = 100;
		boolean success = true;
		float price = 65.25f;
		char ch = 'A';
		String name = "Joker"; //String is a pre-defined class
		
		System.out.println("Value of val is " + val);
		if(success)
			System.out.println("I got success");
		else
			System.out.println("I got failure");
		
		System.out.println("Welcome " + name);
		
		System.out.println("First alphabet: " + ch);
		
		System.out.println("Price for 10 items: " + (price * 10));

	}

}
