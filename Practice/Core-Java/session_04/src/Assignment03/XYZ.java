package Assignment03;

import java.util.Scanner;

public class XYZ {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter How many TWoBHK flats:->");
		
		int size=s.nextInt();
		
		TwoBHK[] rm=new TwoBHK[size];
		
		for(int i=0;i<rm.length;i++)
		{
			
			System.out.println("Enter Room 1 Area:->");
			
			int ra=s.nextInt();
			
			
			System.out.println("Enter Hall Area:->");
			
			int ha=s.nextInt();
			
			System.out.println("Enter Room 2 Area:->");
			
			int rta=s.nextInt();
			
			
			System.out.println("Enter Price:->");
			
			int p=s.nextInt();
			
			
			rm[i] =new TwoBHK(ra,ha,rta,p);
			
		}
		
	TwoBHK ra = new TwoBHK();
	ra.show(rm);
		
		
	
	int total=0;
	
	for(int i=0;i<rm.length;i++)
	{
		total += rm[i].getPrice();
		
	}
	
	System.out.println(total);
		
		
		
		
	}

}
