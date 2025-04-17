package Assignment03;

public class XYZ2 {
	
	public static void main(String[] args) {
		
		FullTimeFaculty f1= new FullTimeFaculty(12,20000,500);
		FullTimeFaculty f2= new FullTimeFaculty(13,12000,500);
		
		PartTimeFaculty f3= new PartTimeFaculty(14,12,500);
		PartTimeFaculty f4= new PartTimeFaculty(14,12,500);
		
		
		f1.display();
		f1.calSal();
		
		f3.display();
		f3.calSal();
		
	}

}
