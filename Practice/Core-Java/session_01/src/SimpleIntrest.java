
public class SimpleIntrest {
	
	private float a;
	private float r;
	private int d;
	private float p;
	private float t;
	public void intiIntrest()
	{
		a=5000.0f;
		r=10.20f;
		d=4;
		
	}
	
	public void DisplayIntrest()
	{
		p=(a*r*d)/100;
		
		t=a+p;
		System.out.println("Simple intrest is -=>" +p); 
		System.out.println(" total Amount is -=>" +t); 
	}
	
	public static void main(String[] args)
	{
		SimpleIntrest si= new SimpleIntrest();
		
		si.intiIntrest();
		
		si.DisplayIntrest();
		
	}
	

}
