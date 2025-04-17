package campus.academics;

import campus.data.Person;

public class Faculty extends Person {
	
	protected int facultyId;
	protected int salary;
	protected String branch;
	
	public Faculty() {
		super();
		
	}
	
	public Faculty(int facultyId , int salary, String branch,String nm,int age,String add) {
		super(nm,age,add);
		this.facultyId = facultyId;
		this.salary = salary;
		this.branch = branch;
	}
	
	public void calSal(Faculty [] e)
	{
		int sum=0;
		for(int i=0;i<e.length;i++)
		{
		sum +=e[i].salary;
		}
		
		System.out.println("Sum of Salary is:-"+sum);
	
	}
	
	
	
	
	

}
