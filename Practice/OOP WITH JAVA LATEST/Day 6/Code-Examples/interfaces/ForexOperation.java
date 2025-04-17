package interfaces;

public class ForexOperation {
	private float amountInput;
	private CurrencyConverter converter;
	public ForexOperation() {
		amountInput = 10000;
		//By default DollarToRupee conversion is used
		converter = new DollarToRupeeConverter();
	}
	public ForexOperation(float amountInput, CurrencyConverter converter) {
		this.amountInput = amountInput;
		this.converter = converter;
	}
	
	public float getConvertedAmount() {
		float amountOutput = converter.doConvert(amountInput);
		return amountOutput;
	}
	public float getAmountInput() {
		return amountInput;
	}
	public void setAmountInput(float amountInput) {
		this.amountInput = amountInput;
	}
	public CurrencyConverter getConverter() {
		return converter;
	}
	public void setConverter(CurrencyConverter converter) {
		this.converter = converter;
	}
	
	
	

}
