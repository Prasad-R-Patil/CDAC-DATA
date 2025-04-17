
package assignment1;
import java.util.Scanner;
public class AreaCircle {

	private float redius;
	private float area;
	
	public void initCircle(float r)
	{
		redius=r;
	}
	
	public void calc()
	{
		area=(float)3.14 * redius*redius;
	}
	
	public void displat()
	{
		System.out.println("Area of Circle is => "+area );
	}
	
	public static void main(String[] args)
	{
		Scanner r= new  Scanner(System.in);
		
		
		
		System.out.println("Enter Reidus of Circle:-");
		float red=r.nextFloat();
		
		AreaCircle ac = new AreaCircle();
		
		ac.initCircle(red);
		ac.calc();
		ac.displat();
		
		
		
		
		
	}
	
}
