package assignment1;
import java.util.Scanner;
public class EmployeePay {
	private float basicSal;
	private float da;
	private float hra;
	private float gs;
	
	public EmployeePay(float bs)
	{
		if(bs<1500)
		{
			basicSal=bs;
		
			da=(basicSal*90)/100;
		
			hra=(basicSal*10)/100;
		
			gs=(basicSal+hra+da);
		}
		else
		{
			basicSal=bs;
			
			da=(basicSal*98)/100;
			
			hra=500;
			
			gs=(basicSal+hra+da);
		}
	}
	
	public String toString()
	{
		return "Employee Salary is => "+basicSal+"  "+da+"  "+hra+" Total Salary  including (Sl+DA+HRA)  "+gs+"";
	}
	
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Employee Salary =>");
		
		float bs=s1.nextFloat();
		
		EmployeePay e1=new EmployeePay(bs);
		
		System.out.println(e1.toString());
		
		
		
		
		
	}
	
	
	

}
