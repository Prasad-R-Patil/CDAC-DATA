package Assignment03;

public class PartTimeFaculty extends Faculty {
	
	protected int hour;
	protected int rate;

	
	public PartTimeFaculty() {}


	public PartTimeFaculty(int fi,int hour, int rate) {
		super(fi);
		this.hour = hour;
		this.rate = rate;
	}
	
	public void calSal()
	{
		salary=hour*rate;
		System.out.println("Salary ="+salary);
	}
	
	
	public void display()
	{
		super.display();
		System.out.println("Hour:->"+hour+" Rate:->"+rate);
	}
	
	
}
