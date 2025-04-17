package campus.academics;

import campus.data.Person;



public class Student extends Person {
	protected int rollNo;
	protected String branch;
	protected int semister;
	
	
	public Student() {
		super();
		
	}
	
	public Student(int rollNo, String branch, int semister,String nm,int age,String add) {
		super(nm,age,add);
		this.rollNo = rollNo;
		this.branch = branch;
		this.semister = semister;
	}
	
	




	
	
	

}
