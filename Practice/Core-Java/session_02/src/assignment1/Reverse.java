package assignment1;

import java.util.Scanner;

public class Reverse {
	private int num;
	
	public int Revers(int num)
	{
		int rev=0;
		while(num!=0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner a1=new Scanner(System.in);
		System.out.println("Enter a number =");
		int num=a1.nextInt();
		
		Reverse rr=new Reverse();
		System.out.println(rr.Revers(num));
		
		

		
		
		
	}
}
