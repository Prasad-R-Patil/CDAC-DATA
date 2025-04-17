package assignment1;
import java.util.Scanner;
public class MathOperation {

	private int x;
	private int y;
	private int r;
	
	public void  initMath(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public int add()
	{
		r=x+y;
		return r;
	}
	
	public int  multiply()
	{
		r=x*y;
		return r;
	}
	
	public int power()
	{
		int p =1;
		for(int i=1;i<=y;i++)
		{
			p=p*x;
		}
		
		 return r=p;
	}
	
	public void display()
	{
		System.out.println(add());
		System.out.println(multiply());
		System.out.println(power());
	}
	
	public static void main(String [] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter First No=>");
		int x=s1.nextInt();
		
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter Second No=>");
		int y=s2.nextInt();
		
		MathOperation mo= new MathOperation();
		mo.initMath(x, y);
		
		//System.out.println(mo.add());;
		/*mo.display();
		mo.multiply();
		mo.display();
		mo.power();
		mo.display();
		*/
		mo.display();
	}
}
