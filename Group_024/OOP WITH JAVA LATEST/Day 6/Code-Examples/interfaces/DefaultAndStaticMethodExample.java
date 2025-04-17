package interfaces;

public class DefaultAndStaticMethodExample {

	public static void main(String[] args) {
		Printable.help();//Invokes static method 
		Printable p = new PrintableImpl();
		p.print();

	}

}
