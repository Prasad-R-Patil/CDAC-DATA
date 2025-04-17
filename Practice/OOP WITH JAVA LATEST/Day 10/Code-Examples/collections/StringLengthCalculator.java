package collections;

public class StringLengthCalculator implements Calculator<String, Integer> {

	@Override
	public Integer doCalculate(String str) {
		// TODO Auto-generated method stub
		return str.length();
	}

}
