package Assignment04;

public class Employee extends Taxable {
    protected int empId;
    protected String name;
    protected float salary;

  
    public Employee() {}

  
    public Employee(int id, String nm, float sal) {
        empId = id;
        name = nm;
        salary = sal;
    }

    @Override
    public void calTax() {
        float tax = ((salary * 12) * incomeTax) / 100;
        System.out.println("Income Tax for " + name + " (ID: " + empId + ") is " + tax);
    }

  
    public void display() {
        System.out.println("ID: " + empId + ", Name: " + name + ", Salary: " + salary);
    }
}
