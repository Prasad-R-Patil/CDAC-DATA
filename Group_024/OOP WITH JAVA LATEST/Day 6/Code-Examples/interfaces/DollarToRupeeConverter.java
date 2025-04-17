package interfaces;

public class DollarToRupeeConverter implements CurrencyConverter {

	@Override
	public float doConvert(float amountInDollars) {
		// TODO Auto-generated method stub
		float amountInRupees = amountInDollars * DOLLAR_TO_RUPEE;
		return amountInRupees;
	}

}
