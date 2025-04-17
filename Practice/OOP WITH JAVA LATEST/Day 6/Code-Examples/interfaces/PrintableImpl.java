package interfaces;

public class PrintableImpl implements Printable {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		//Start the printing
		startPrinting();//Invoking the default method
		System.out.println("Printing in progress");

	}

}
