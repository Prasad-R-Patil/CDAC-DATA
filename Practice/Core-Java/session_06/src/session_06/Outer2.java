package session_06;

public class Outer2 {
	
	private int no=10;
	
	private class Inner
	{
		private int no=100;
		public void getNo()
		{
			int no=1000;
			System.out.println("no= "+no);
			System.out.println("no= "+this.no);
			System.out.println("no= "+Outer2.this.no);
					
		}
	}
	
	public void get()
	{
		Inner i=new Inner();
		i.getNo();
	}
	

	public static void main(String[] args) {
		Outer2 o=new Outer2();
		//Inner i=o.new Inner();
		//i.getNo();
		//Inner i1=new Outer2().new Inner();
		//i1.getNo();
		o.get();
		
	}
	
	
}
