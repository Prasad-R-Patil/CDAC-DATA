package interfaces;

public class InterfaceLooseCouplingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using the default amount and the converter
		ForexOperation forex = new ForexOperation();
		float convertedAmount = forex.getConvertedAmount();
		System.out.println(convertedAmount);
		
		//Changing the amount as well as the converter
		forex.setAmountInput(500000);
		forex.setConverter(new RupeeToPoundConverter());
		convertedAmount = forex.getConvertedAmount();
		System.out.println(convertedAmount);

	}

}
