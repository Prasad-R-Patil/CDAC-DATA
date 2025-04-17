package interfaces;

public interface Printable {
	void print();//Abstract method
	default void startPrinting() { //Default implemented method
		System.out.println("Printing starts...");
	}
	static void help() { //Static implemented method
		System.out.println("This interface is meant for printing the document");
	}

}
