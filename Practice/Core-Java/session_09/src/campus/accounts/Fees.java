package campus.accounts;

import java.text.SimpleDateFormat;
import java.util.Date;

import campus.academics.Student;

public class Fees extends Student {
	
	protected int amount;
	
	protected Date payDate;

	public Fees() {
		super();
		
	}

	public Fees(int rollNo, String branch, int semister, String nm, int age, String add,int amount,Date payDate) {
		super(rollNo, branch, semister, nm, age, add);
		this.amount=amount;
		this.payDate=payDate;
	}
	
	public void calfees(Fees[] e)
	{
		int sum=0;
		for(int i=0;i<e.length;i++)
		{
			sum += e[i].amount;
	
		}
		 
		 
		System.out.println("Students Total Paid Fees is :- "+sum);
		
	}
	
	
	
	
	

}
