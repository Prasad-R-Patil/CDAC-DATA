import java.util.ArrayList;
import java.util.Scanner;

public class Cured {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        

        ArrayList<Employee> empList = new ArrayList<Employee>();

        int choice;
        do {
            System.out.println("\nChoose one Option");
            System.out.println("1. Add Employee(s)");
            System.out.println("2. Remove Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete All Employees");
            System.out.println("5. Display All Employees");
            System.out.println("0. Exit");
            System.out.print("=>> ");
            choice = s.nextInt();
            s.nextLine(); 

            switch (choice) {
                case 1: {
                    // Add employee
                    System.out.print("How many employees do you want to add: ");
                    int numEmployees = s.nextInt();
                    s.nextLine(); 

                    for (int i = 0; i < numEmployees; i++) {
                        System.out.println("\nEnter details for Employee " + (i + 1) + ":");
                        System.out.print("Enter id: ");
                        int id = s.nextInt();
                        s.nextLine(); 
                        System.out.print("Enter name: ");
                        String name = s.nextLine();

                        Employee newEmployee = new Employee(id, name);
                        empList.add(newEmployee);
                        System.out.println("Employee added successfully.");
                    }
                    break;
                }
                case 2: {
                    // Remove employee
                    if (empList.isEmpty()) {
                        System.out.println("Employee list is empty. Nothing to remove.");
                        break;
                    }
                    System.out.print("Enter the id of the employee to remove: ");
                    int removeId = s.nextInt();
                    s.nextLine(); 

                    boolean removed = false;
                    for (int i = 0; i < empList.size(); i++) {
                        if ((empList.get(i).getId()) == removeId) 
                        {
                            empList.remove(i);
                            System.out.println("Employee with id " + removeId + " removed successfully.");
                            removed = true;
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Employee with id " + removeId + " not found.");
                    }
                    break;
                }
                case 3: {
                    // Update employee
                    if (empList.isEmpty()) {
                        System.out.println("Employee list is empty. Nothing to update.");
                        break;
                    }
                    System.out.print("Enter the id of the employee to update: ");
                    int updateId = s.nextInt();
                    s.nextLine(); 

                    boolean found = false;
                    for (Employee employee : empList) {
                        if (employee.getId() == updateId) {
                            System.out.print("Enter new name for employee with id " + updateId + ": ");
                            String newName = s.nextLine();
                            employee.name = newName;
                            System.out.println("Employee with id " + updateId + " updated successfully.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee with id " + updateId + " not found.");
                    }
                    break;
                }
                case 4: {
                    // Delete all employees
                    if (empList.isEmpty()) {
                        System.out.println("Employee list is already empty.");
                    } else {
                        empList.clear();
                        System.out.println("All employees deleted successfully.");
                    }
                    break;
                }
                case 5: {
                    // Display all employees
                    if (empList.isEmpty()) {
                        System.out.println("Employee list is empty.");
                    } else {
                        System.out.println("\n--- Employee List ---");
                        for (Employee employee : empList) {
                            System.out.println(employee);
                        }
                        System.out.println("---------------------");
                    }
                    break;
                }
                case 0: {
                    System.out.println("Exiting Employee Management System.");
                    break;
                }
                default: {
                    System.out.println("Invalid choice. Please try again.");
                    break;
                }
            }
        } while (choice != 0);

        s.close();
    }
}