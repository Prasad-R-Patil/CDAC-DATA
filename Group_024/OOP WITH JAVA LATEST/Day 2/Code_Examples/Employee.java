
public class Employee {
	private int empNo;//Makes accessible only within this class; not outside the class
	private String empName;
	private float empSalary;
	
	//Adding a method to assign values for empNo, empName and empSalary
	public void assignValues(int employeeNo, String employeeName, float employeeSalary) {
		//Assigning the value available in employeeNo to empNo
		empNo = employeeNo;
		//Apply same logic for other assignments
		empName = employeeName;
		empSalary = employeeSalary;
	}
	
	//Adding a method to return the information (String) of the employee
	public String getEmployeeDetails() {
		String empDetails = 
				"Employee No: " + empNo + "\nName: " + empName + "\nSalary: " + empSalary;
		return empDetails;
	}
	
	public float getAnnualSalary() {//Method names are camelCased
		float annualSalary = empSalary * 12;
		return annualSalary;
	}
	
	public boolean isHighlyPaid() {
		//If an employee earns above 150000 per annum is Highly Paid
		float annualSalary = getAnnualSalary();
		boolean highlyPaid = false;
		if(annualSalary > 150000)
			highlyPaid = true;
		return highlyPaid;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	
	

}








