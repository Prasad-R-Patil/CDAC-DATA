
public class Employee 
{
	private int empId;
	private String empName;
	private float empSal;
	
	public void initEmp()
	{
		empId=111;
		empName="Rahul";
		empSal=12000.86f;
	}
	
	public void displayEnp()
	{
		System.out.println("Employee= "+empId+"  "+empName+"  "+empSal);
	}
	
	public static void main(String args[])
	{
		Employee e= new Employee();
		
		System.out.println("Emp id ="+e.empId);
		System.out.println("Emp Name ="+e.empName);
		System.out.println("Emp Salery ="+e.empSal);
		
		System.out.println("====================================================");
		
		e.initEmp();
		
		System.out.println("====================================================");
		
		System.out.println("Emp id ="+e.empId);
		System.out.println("Emp Name ="+e.empName);
		System.out.println("Emp Salery ="+e.empSal);
		
		System.out.println("====================================================");
		
		e.displayEnp();
		
		
	}
}
