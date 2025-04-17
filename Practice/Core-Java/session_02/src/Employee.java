
public class Employee {
	private int empId;
	private String empName;
	private static int count;
	
	
	public Employee(int empId,String empName)
	{
		this.empId = empId;
		this.empName = empName;
		count++;
	}
	
	public String toString()
	{
		return "Employee => ["+empId+"  "+empName+" ]";
	}
	
	public static int getCount()
	{
		return count;
	}
	
	static
	{
		System.out.println("Static Block Called");
		count=110;
	}
	
	public static void main(String [] args)
	{
		System.out.println("In main Method");
		Employee e1=new Employee(111,"Sagar");
		Employee e2=new Employee(112,"Prasad");
		Employee e3=new Employee(113,"ZakanZulya");
		Employee e4=new Employee(114,"Tejas");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		
		System.out.println("Employee Count => "+Employee.count);
	}

}
