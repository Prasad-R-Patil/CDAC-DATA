package session_06;

public class Test1 {
	public static void main(String[] args) {
		B b=new B();
		double d=b.div(2, 5);
		
		if(d<1)
		{
			try {
				throw new MyException();
			
			}catch(MyException e)
			{
				System.out.println(e);
			}
			
			
		}
		System.out.println("d= "+d);
	}
}
