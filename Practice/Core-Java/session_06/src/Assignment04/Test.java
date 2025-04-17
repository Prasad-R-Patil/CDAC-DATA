package Assignment04;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int ch;
	do {
		
		System.out.println("1 . Factorial:->");
		System.out.println("2 . Area Of circle :->");
		System.out.println("3 . Exit :->");
		System.out.println("Enter Which Process you Want:->");
		ch =s.nextInt();
		
		
		switch(ch)
		{
		case 1:
			System.out.println("Enter Number:->");
			int d=s.nextInt();
			
			Processor p= new Factorial(d);
			p.Process();
			p.showData();
			break;
		case 2:
			System.out.println("Enter Redius:->");
			int d1=s.nextInt();
			Processor p1=new Circle(d1);
			p1.Process();
			p1.showData();
			break;
		case 3:
			System.out.println("Exit");
			break;
			default:
				System.out.println("Enter valid choice");
		}
		
		
		
	}while(ch!=3);
	
	s.close();
}
}
