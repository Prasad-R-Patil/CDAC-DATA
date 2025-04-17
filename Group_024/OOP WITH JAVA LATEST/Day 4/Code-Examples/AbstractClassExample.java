
public class AbstractClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shape sh = new Shape();
		//The above statement raises a compilation error because Abstract class cannot be instantiated
		
		//Creating an array of type Shape
		Shape shapes[] = new Shape[2];
		shapes[0] = new Rectangle();
		shapes[1] = new Circle();
		for(Shape sh : shapes) {
			sh.draw();
			float area = sh.findArea();
			System.out.println("Area  = " + area);
			sh.erase();
		}

	}

}
