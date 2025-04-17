
public class Rectangle extends Shape {
	protected float Arearect;
	
	public Rectangle(int len,int br)
	{
		super(len,br);
		
	}
	
	public void calculateArea()
	{
		Arearect=len*br;
		System.out.println(Arearect);
	}
	
	

}
