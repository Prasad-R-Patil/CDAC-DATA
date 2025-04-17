
public class SimpleArrayAsArgumentExample {
	
	private static int getSum(int numsArray[]) {
		int sum = 0;
		for(int num : numsArray)
			sum += num;
		return sum;
	}
	
	private static double[] getSquareRoots(int numsArray[]) {
		int size = numsArray.length;//Obtaining size of incoming array
		//Declaring outgoing array with dimension depending upon the size 
		//of incoming array
		double squareRootValues[] = new double[size];//Dynamic Array
		int index = 0;
		for(int num : numsArray) {
			double sqRoot = Math.sqrt(num);
			squareRootValues[index] = sqRoot;
			index++;
		}
		return squareRootValues;
	}

	public static void main(String[] args) {
		int numbers[] = {16, 81, 8, 93, 23, 87, 90, 122};
		int sum = getSum(numbers);
		System.out.println("Sum = " + sum);
		
		System.out.println("---------------------");
		double squareRoots[] = getSquareRoots(numbers);
		for(double sRoot : squareRoots)
			System.out.println(sRoot);

	}

}
