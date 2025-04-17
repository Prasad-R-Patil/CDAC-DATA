package assignment1;
import java.util.Scanner;
public class Temprature {

	private float fahrenheit;
	private float cal;
	
	public float Convert(float fahrenheit)
	{
		cal=5*(fahrenheit-32)/9;
		
		return cal;
	}
	
	public static void main(String[] args) {
		Scanner fh=new Scanner(System.in);
		
		System.out.println("Enter Fahrenheit =");
		
		float fahrenheit=fh.nextFloat();
		
		Temprature th=new Temprature();
		
		System.out.println("Temprature in calcues =");
		
		System.out.println(Math.round(th.Convert(fahrenheit)));
		
		
		
		
	}
	
}
