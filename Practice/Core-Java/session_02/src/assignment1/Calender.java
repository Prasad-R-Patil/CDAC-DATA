package assignment1;
import java.util.Scanner;
public class Calender {
	private  int year;
	private int month;
	private int day;
	private int Tdays;
	
	public void inIt(int Tdays)
	{
		this.Tdays=Tdays;
		year=Tdays/365;
		Tdays=Tdays%365;
		month=Tdays/30;
		day=Tdays%30;
		
		System.out.println("Year = " +year+ "   month= "+month+" Day= "+day);
	}
	
	public static void main(String[] args) {
		
		Calender c= new Calender();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Days =");
		
		int Tdays=s1.nextInt();
		c.inIt(Tdays);
		
	
	}
	
	
	
	
	
	
}
