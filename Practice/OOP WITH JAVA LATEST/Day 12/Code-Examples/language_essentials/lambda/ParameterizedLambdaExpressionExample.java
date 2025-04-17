package language_essentials.lambda;

import interfaces.CurrencyConverter;

public class ParameterizedLambdaExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrencyConverter euroToRupeesConverter = amt -> amt * 90.45f;
		//When a method returns a value, do not use 'return' statement while working with single expression lambda
		float inr = euroToRupeesConverter.doConvert(1000);
		System.out.println(inr);
		
		CurrencyConverter yenToRupeesConverter = (amountInYen) -> {
			float rupees = amountInYen / 1.7f;
			return rupees;
		};
		inr = yenToRupeesConverter.doConvert(20000);
		System.out.println(inr);

	}

}
