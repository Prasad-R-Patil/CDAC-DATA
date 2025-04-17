package Assignment04;

public class Employee1 {
	 private int empId;
    private String name;
    private double salary;

    public Employee1(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    
    @Override
    public String toString() {
        return "Employee ID: " + empId + ", Name: " + name + ", Salary: " + String.format("%.2f", salary);
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee1 other = (Employee1) obj;
        return this.empId == other.empId;
    }
	
	

}
