package Assignment_02;

import java.util.Scanner;


public class Record {

	public void Arrange(Student [] stud)
	{
		System.out.println("Student have score in range 0-50 ");
		
		for(int i=0;i<stud.length;i++)
		{
			if ((stud[i].getScore()>0) && (stud[i].getScore()<=50))
			{
				 System.out.println("Name: " + stud[i].getName() + ", Roll No: " + stud[i].getRollNo() + ", Age: " + stud[i].getAge() + ", Score: " + stud[i].getScore());
				
			}
		}
		
		System.out.println("Student have score in range 50-65 ");
		
		for(int i=0;i<stud.length;i++)
		{
			if ((stud[i].getScore()>50) && (stud[i].getScore()<=65))
			{
				 System.out.println("Name: " + stud[i].getName() + ", Roll No: " + stud[i].getRollNo() + ", Age: " + stud[i].getAge() + ", Score: " + stud[i].getScore());;
				
			}
		}
		
		
		
System.out.println("Student have score in range 65-80 ");
		
		for(int i=0;i<stud.length;i++)
		{
			if ((stud[i].getScore()>65) && (stud[i].getScore()<=80))
			{
				 System.out.println("Name: " + stud[i].getName() + ", Roll No: " + stud[i].getRollNo() + ", Age: " + stud[i].getAge() + ", Score: " + stud[i].getScore());;
				
			}
		}
		
		
		
System.out.println("Student have score in range 80-100 ");
		
		for(int i=0;i<stud.length;i++)
		{
			if ((stud[i].getScore()>80) && (stud[i].getScore()<=100))
			{
				 System.out.println("Name: " + stud[i].getName() + ", Roll No: " + stud[i].getRollNo() + ", Age: " + stud[i].getAge() + ", Score: " + stud[i].getScore());;
				
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of Students  :->");
		
		int size=s.nextInt();
		
		Student stud[]=new Student[size];
		
		for(int i=0;i<stud.length;i++)
		{
			System.out.println("Enter Student Details" +(i+1));
			System.out.println("Enter Name :->");
			
			String nm=s.next();
			
			System.out.println("Enter RollNo :->");
			
			int rn=s.nextInt();
			
			System.out.println("Enter Age :->");
			
			int ag=s.nextInt();
			
			System.out.println("Enter Score :->");
			
			int sc=s.nextInt();
			
			stud[i]=new Student(nm,rn,ag,sc);
			
		}
		Record rs=new Record();
		
		
		rs.Arrange(stud);
		
	}
}
