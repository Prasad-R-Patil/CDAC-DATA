package assignment1;
import java.util.Scanner;
public class Swap {
	private int a;
	private int b;
	
	public void SwapValue(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The value of A="+a);
		System.out.println("The value of B="+b);
	}
	
	public static void main(String[] args) {
		Scanner a1=new Scanner(System.in);
		System.out.println("Enter a number A=");
		int a=a1.nextInt();
		
		Scanner a2=new Scanner(System.in);
		System.out.println("Enter a number B=");
		int b=a2.nextInt();
		
		Swap ss=new Swap();
		ss.SwapValue(a, b);
		
		
		
	}

}
