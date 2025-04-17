package collections;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator<String, Integer> calc1 = new StringLengthCalculator();
		Integer len = calc1.doCalculate("Welcome");
		
		Calculator<Integer, Double> calc2 = new SquareRootCalculator();
		Double squareRoot = calc2.doCalculate(50);
		System.out.println(len);
		System.out.println(squareRoot);

	}

}
