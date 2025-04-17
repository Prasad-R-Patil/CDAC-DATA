
public class EmployeeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee firstEmployee = new Employee();
		//Assigning values for firstEmployee
		firstEmployee.assignValues(101, "James", 20000.25f);
		
		//Retrieving the details of firstEmployee
		String firstEmployeeDetails = firstEmployee.getEmployeeDetails();
		System.out.println(firstEmployeeDetails);
		System.out.println("------------------------------------------");
		System.out.println(firstEmployee.getEmployeeDetails());
		
		float firstEmployeeAnnualSalary = firstEmployee.getAnnualSalary();
		System.out.println("Annual Salary of First Employee: " + firstEmployeeAnnualSalary);
		
		boolean highlyPaid = firstEmployee.isHighlyPaid();
		if(highlyPaid)
			System.out.println("This employee is highly paid");
		else
			System.out.println("This employee is not highly paid");

	}

}
