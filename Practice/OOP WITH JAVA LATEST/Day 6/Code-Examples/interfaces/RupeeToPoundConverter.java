package interfaces;

public class RupeeToPoundConverter implements CurrencyConverter {

	@Override
	public float doConvert(float amountInRupees) {
		// TODO Auto-generated method stub
		float amountInPounds = amountInRupees / POUND_TO_RUPEE;
		return amountInPounds;
	}

}
