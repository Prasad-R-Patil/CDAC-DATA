package Assignment03;

public class SchoolStudent extends Student {
	
	protected int className;

	public SchoolStudent() {
		
	}
	public SchoolStudent(int rollNo, float percentage,int className) {
		super(rollNo, percentage);
		this.className=className;
	}
	
	
	public void show(SchoolStudent [] cs)
	{
		System.out.println("---------------------------------------------------");
		System.out.println("School Student is");
		
		System.out.println("---------------------------------------------------");
		
		for(int i=0;i<cs.length;i++)
		{
			System.out.println("School Student Rollno="+cs[i].rollNo+" Semister:->"+cs[i].className+"  Persentage:->"+cs[i].percentage);
			
		}
		
		
		System.out.println("---------------------------------------------------");
		
	}
	
	

}
