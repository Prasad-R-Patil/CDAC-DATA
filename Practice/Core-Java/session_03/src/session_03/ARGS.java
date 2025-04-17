package session_03;

public class ARGS {
	
	public static void main(String[] args) {
		
		if(args.length==3)
		{
			long p = Long.parseLong(args[0]);
			int  d = Integer.parseInt(args[1]);
			float r = Float.parseFloat(args[2]);
			
			double si = (float)(p*r*d/100);
			
			System.out.println("Simple interst =-> "+si);
		}
		else
		{
			System.out.println("Insufficent Arguments...");
		}
	}
}
