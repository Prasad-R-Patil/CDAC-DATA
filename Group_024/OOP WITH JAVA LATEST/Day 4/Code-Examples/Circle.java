
public  final class Circle extends Shape {//The class is declared as final and hence cannot be sub-classed
	private int radius;
	public Circle() {
		// TODO Auto-generated constructor stub
		radius = 10;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a circle with radius: " + radius);
		
	}

	@Override
	public float findArea() {
		// TODO Auto-generated method stub
		float area = 3.14f * radius * radius;
		return area;
	}
}







