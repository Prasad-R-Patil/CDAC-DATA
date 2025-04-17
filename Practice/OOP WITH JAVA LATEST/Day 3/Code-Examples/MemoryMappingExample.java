
public class MemoryMappingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = emp2;
		//In the above statement reference 'emp3' refers to the same object which
		//is being referred by 'emp2'
		emp2.setEmpName("James");
		System.out.println(emp3.getEmpName());
		
		emp.setEmpName("Jack");
		System.out.println(emp.getEmpName());
		
		emp = new Employee();
		System.out.println(emp.getEmpName());

	}

}
