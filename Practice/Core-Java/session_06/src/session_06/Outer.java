package session_06;

public class Outer {
	private int no=10;
	
	private class Inner
	{
		private int no=100;
		public void getNo()
		{
			int no=1000;
			System.out.println("no= "+no);
			System.out.println("no= "+this.no);
			System.out.println("no= "+Outer.this.no);
					
		}
	}
	

	public static void main(String[] args) {
		Outer o=new Outer();
		Inner i=o.new Inner();
		i.getNo();
		Inner i1=new Outer().new Inner();
		i1.getNo();
		
		
	}
}
