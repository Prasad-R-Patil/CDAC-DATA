package Assignment04;

import java.util.Scanner;

public class XYZ1 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
        System.out.println("Enter How many Employee");
        int y = sc.nextInt();
        Employee1[] employees = new Employee1[y];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter Employee ID :");
            int empId = sc.nextInt();
            sc.nextLine();  
            
            System.out.println("Enter Employee  Name:");
            String name = sc.nextLine();
            
            System.out.println("Enter Employee Salary:");
            double salary = sc.nextDouble();

            Employee1 newEmp = new Employee1(empId, name, salary);

            boolean exists = false;
            for (int j = 0; j < i; j++) {
                if (newEmp.equals(employees[j])) {
                    exists = true;
                    break;
                }
            }

            if (exists) 
            {
                System.out.println("Employee ID already exists! Please enter a different one.");
                i--; 
            } 
            else
            {
                employees[i] = newEmp;
            }
        }

        System.out.println("\nAll Employee Details:");
        for (Employee1 e : employees) {
            System.out.println(e);
        }

        sc.close();
	}

}
