package language_essentials.lambda;

public class MultipleParameterizedLambdaExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperator opAdd = (x, y) -> x + y;
		MathOperator opSubtract = (int a, int b) -> a - b;
		
		int result = opAdd.getResult(10, 20);
		System.out.println(result);
		
		result = opSubtract.getResult(60, 45);
		System.out.println(result);

	}

}
