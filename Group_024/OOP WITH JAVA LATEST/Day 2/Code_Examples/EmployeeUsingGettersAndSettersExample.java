
public class EmployeeUsingGettersAndSettersExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		//Assigning the values
		emp.assignValues(102, "Jack", 50000.75f);
		//Retrieving the values
		System.out.println(emp.getEmployeeDetails());
		
		//Changing the salary of this employee
		emp.setEmpSalary(75000.80f);
		//Retrieving the Changed values
		System.out.println(emp.getEmployeeDetails());
		
		//Retrieving only the name of the employee
		String ename = emp.getEmpName();
		//Retrieving only the salary of the employee
		float salary = emp.getEmpSalary();
		
		System.out.println(ename + " is earning a salary : " + salary);
	}

}








