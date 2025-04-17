package Assignment03;

public class Faculty {
	
	protected int facultyId;
	protected int salary;
	
	public Faculty() {}
	
	public Faculty(int fi)
	{
		facultyId=fi;
		
	}
	
	public void calSal()
	{
		salary=0;
	}
	
	
	
	public void display()
	{
		System.out.println("Faculty Id"+facultyId+" Salary:->"+salary);
	}

}
