package Assignment03;

public class CollegeStudent extends Student {
	
	protected int semister;
	

	public CollegeStudent() {
		

	}

	public CollegeStudent(int rollNo, float percentage,int semister) {
		super(rollNo, percentage);
		this.semister=semister;
		
	}
	
	
	
	
	public void show(CollegeStudent [] cs)
	{
		System.out.println("---------------------------------------------------");
		System.out.println("College Student is");
		
		System.out.println("---------------------------------------------------");
		
		for(int i=0;i<cs.length;i++)
		{
			System.out.println("College Student Rollno="+cs[i].rollNo+" Semister:->"+cs[i].semister+"  Persentage:->"+cs[i].percentage);
			
		}
		
		
		System.out.println("---------------------------------------------------");
		
	}

	
	
	

}
