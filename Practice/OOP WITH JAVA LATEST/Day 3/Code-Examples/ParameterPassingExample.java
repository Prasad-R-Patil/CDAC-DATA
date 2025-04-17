
public class ParameterPassingExample {

	public static void main(String[] args) {
		int x = 100;
		System.out.println("Before Change in Primitive: " + x);
		changeX(x);
		System.out.println("After Change in Primitive: " + x);
		
		//------------------------------
		
		Employee emp = new Employee();
		emp.assignValues(101, "Tom", 40000);
		System.out.println("Employee Details before change: " + emp.getEmployeeDetails());
		changeEmployee(emp);
		System.out.println("Employee Details after change: " + emp.getEmployeeDetails());
	}

	private static void changeEmployee(Employee empRef) {
		empRef.assignValues(102, "Cat", 50000);
		
	}

	private static void changeX(int a) {
		// TODO Auto-generated method stub
		a = 200;
		System.out.println("Value inside a method: " + a);
	}

}
