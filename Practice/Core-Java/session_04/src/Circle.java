
public class Circle extends Shape {
		protected float CirArea;
		private final float PI=3.14f;
		
		public Circle(int redius)
		{
			super(redius);
		}
		
		public void calculatArea()
		{
			CirArea=PI*radius*radius;
			
			System.out.println(CirArea);
		}
		
		
}
