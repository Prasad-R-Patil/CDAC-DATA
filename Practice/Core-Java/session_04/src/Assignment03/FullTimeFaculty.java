package Assignment03;

public class FullTimeFaculty extends Faculty {
	protected int basic;
	
	protected int allowance;
	
	public FullTimeFaculty() {}
	
	
	public FullTimeFaculty(int fi,int bs,int al) 
	{
		super(fi);
		
		basic=bs;
		
		allowance=al;
		
	}
	
	public void calSal()
	{
		salary=basic+allowance;
		
		System.out.println("Salary ="+salary);
	}
	
	
	
	
	public void display()
	{
		super.display();
		System.out.println(" basic:->"+basic+"  allowance:->"+allowance);
	}
	
	
	
	
	
	

}
