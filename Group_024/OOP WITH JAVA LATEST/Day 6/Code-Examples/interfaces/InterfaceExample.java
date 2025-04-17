package interfaces;

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Foreign Exchange....");
		System.out.println("Before we begin, let's have a look at conversion rates: ");
		System.out.println("Dollar to Rupees: " + CurrencyConverter.DOLLAR_TO_RUPEE);
		System.out.println("Pound to Rupees: " + CurrencyConverter.POUND_TO_RUPEE);
		//trying to modify dollar rate: 
		//CurrencyConverter.DOLLAR_TO_RUPEE = 83.45f;
		//The above statement is invalid because interface variables are by default final
		CurrencyConverter forexConverter;
		forexConverter = new DollarToRupeeConverter();
		float usDollars = 10000;
		float indianRupees = forexConverter.doConvert(usDollars);
		System.out.println("Amount in INR for USD: " + usDollars + " is " + indianRupees);
		System.out.println("-------------------------------------");
		forexConverter = new RupeeToPoundConverter();
		indianRupees = 5000000;
		float gbPounds =  forexConverter.doConvert(indianRupees);
		System.out.println("Amount in GBP for INR: " + indianRupees + " is " + gbPounds);

	}

}












