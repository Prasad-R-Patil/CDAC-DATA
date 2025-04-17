package session_03;

import java.util.Scanner;

public class Test
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter No of Student =->");
		
		int size=s.nextInt();
		Student std[]=new Student[size];
		System.out.println("Enter Student Details:");
		
		for(int i=0;i<std.length;i++)
		{
			System.out.println("Enter Student "+(i+1)+"data =");
			System.out.println("Enter Rollno =");
			int rn=s.nextInt();
			System.out.println("Enter Name =");
			String nm=s.next();
			System.out.println("Enter marks 1=");
			int m1=s.nextInt();
			System.out.println("Enter marks 2=");
			int m2=s.nextInt();
			System.out.println("Enter marks 3=");
			int m3=s.nextInt();
			
		std[i]=new Student(rn,nm,m1,m2,m3);	
		}
		
		System.out.println("Student are as Follow");
		
		for(int i=0;i<std.length;i++)
		{
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println(std[i].getRollNo()+"  "+std[i].getName()+"  "+std[i].getM1()+"   "+std[i].getM2()+"  "+std[i].getM3());
			System.out.println("-----------------------------------------------------------------------------");
		}
		
		Student.getMarkesObtained(std);
		
		
	}	
}
