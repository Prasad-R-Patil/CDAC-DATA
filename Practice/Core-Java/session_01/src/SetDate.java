
public class SetDate {
	private int dd;
	private int mm;
	private int yy;
	
	public void SetDate()
	{
		dd=31;
		mm=3;
		yy=2025;
	}
	
	public void DisplayDate()
	{
		System.out.println("Date => " +dd+"/"+mm+"/"+yy );
	}
	
	public static void main(String args[])
	{
		SetDate s= new SetDate();
		
		s.SetDate();
		s.DisplayDate();
		
	}
	
}
