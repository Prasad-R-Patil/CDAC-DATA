
public class Student {
	
	private int rollNo;
	private String name;
	private float marks;
	
	public Student()
	{
		System.out.println("Default Constructor Invoked!!...");
		
		rollNo=1;
		name="Sagar";
		marks=89.67f;
		
	
	
	}
	
	public Student(int rn,String nm,float mks)
	{
		System.out.println("Parmeterised Constructor Called");
		
		rollNo=rn;
		name=nm;
		marks=mks;
	}
	
	
	public static void main(String [] args)
	{
		Student s=new Student();
		System.out.println(s.rollNo+"  "+s.name+"  "+s.marks );
		
		Student s1=new Student();
		
		System.out.println(s.rollNo+"  "+s.name+"  "+s.marks);
		
	}

}
