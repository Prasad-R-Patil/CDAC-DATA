
public class AreaCircle {
		private float redius;
		private float pi;
		private float area;
		private double circumferance;
		
		public void initAC()
		{
			redius=5.0f;
			pi=3.14f;
			
			
		}
		
		
		public void CalculateArea()
		{
			area= pi*redius*redius;
			
		}
		
		public void CalculateCircum()
		{
			circumferance=2*pi*redius;
		}
		
		public void display()
		{
			System.out.println("Area of Circle is => "+area);
			
			System.out.println("Area of Circumferance => "+circumferance);
			
		}
		
		public static void main(String args[])
		{
			AreaCircle a= new AreaCircle();
			a.initAC();
			a.CalculateArea();
			a.CalculateCircum();
			a.display();
		}
		
		
		
}
