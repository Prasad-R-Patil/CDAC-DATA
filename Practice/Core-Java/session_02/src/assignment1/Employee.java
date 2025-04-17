package assignment1;

public class Employee {
	private static int empNo;
	private int salary;
	private static int totalSalary;
	
	
	public Employee(int sal)
	{
		this.empNo= ++empNo;
		salary=sal;
		
		totalSalary += salary;
	}
	
	
	
	public void display()
	{
		
		System.out.println("Employee = > "+empNo+" "+salary);
		
	}
	
	public static void displaytotal()
	{
		System.out.println("Total Salary is =>"+totalSalary);
	}
	

	
	public static void main(String[] args) {
		Employee em= new Employee(12000);
		em.display();
		Employee em1= new Employee(12500);
		em1.display();
		
		Employee.displaytotal();
		
		
	}

}
