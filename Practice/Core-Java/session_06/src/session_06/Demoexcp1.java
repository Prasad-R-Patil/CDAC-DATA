package session_06;

public class Demoexcp1 {
	public static void main(String[] args) {
		try {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a/b;
			System.out.println("c= "+c);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//System.out.println(e);
			
			System.out.println("Atlest Enter 2Parameter");
		}
		catch(NumberFormatException e)
		{
			//System.out.println(e);
			
			System.out.println("Enter Only Interger value");
		}
		catch(ArithmeticException e)
		{
			//System.out.println(e);
			
			System.out.println("Denometer Shold not be Zero");
		}
		catch(Exception e)
		{
			//System.out.println(e);
			
			System.out.println("Exception Occurred...!!");
		}
	}
}
