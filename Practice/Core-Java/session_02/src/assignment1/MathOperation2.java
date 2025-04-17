package assignment1;


public class MathOperation2 {

	
	
	
	public void  multiply(int x,int y)
	{
		System.out.println("Multiply of two int => " +(x*y));
	}
	
	public void  multiply(float x,float y,float z)
	{
		System.out.println("Multiply of three  float => " +(x*y*z));
	}
	
	public void  multiply(int arr[])
	{
		int m=1;
		for(int i=0;i<arr.length;i++)
		{
			m=m*arr[i];
		}
		
		System.out.println("Multiply of array  =>"+m);
	}
	
	public void multiply(double y,int z)
	{
		System.out.println("Multiply of double and int => " +(y*z));
	}
	
	
	
	public static void main(String [] args)
	{
		int arr[]= {12,13,423,53,36};
		MathOperation2 mo= new MathOperation2();
		
		mo.multiply(10, 20);
		mo.multiply(arr);;
		mo.multiply(14.5f, 13.5f, 12.2f);
		mo.multiply(7.25d, 5);
	}
}
