
public class Persentage 
{
	private float persentage;
	private float sub1;
	private float sub2;
	private float sub3;
	private float sub4;
	private float sub5;
	
	public void initSub()
	{
		sub1=50.34f;
		sub2=55.03f;
		sub3=67.45f;
		sub4=78.20f;
		sub5=80.40f;
		
	}
	
	public void Result()
	{
		persentage=((sub1+sub2+sub3+sub4+sub5)/5);
		
		
		System.out.println("Persntage of Student is => "+persentage);
		
	}
	
	public static void main(String args[])
	{
		Persentage p= new Persentage();
		p.initSub();
		p.Result();
	}
}
