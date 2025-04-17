package interfaces;

public interface CurrencyConverter {
	float DOLLAR_TO_RUPEE = 79.38f;
	float POUND_TO_RUPEE = 104.34f;
	float doConvert(float amount);
}
