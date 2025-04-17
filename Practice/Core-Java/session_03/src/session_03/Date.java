package session_03;

public class Date {
	private int dd,mm,yy;
	
	public Date(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		
	}
	
	public String toString()
	{
		return " Date [dd="+dd+", mm = "+mm+", yy= "+yy+"]";
	}
	
	public static void swapDate(Date d[])
	{
		Date temp;
		
		temp=d[0];
		d[0]=d[1];
		d[1]=temp;
		
	}
	
	
	public static void main(String[] args) {
		
		Date d[]=new Date[2];
		Date d1=new Date(1,4,2025);
		Date d2=new Date(2,5,2024);
		
		d[0]=d1;
		d[1]=d2;
		
		System.out.println("Before Swapping .......");
		
		System.out.println(" d1= "+d[0]);
		System.out.println(" d2= "+d[1]);
		
		Date.swapDate(d);
System.out.println("Before Swapping .......");
		
		System.out.println(" d1= "+d[0]);
		System.out.println(" d2= "+d[1]);

		
		
	}
}
