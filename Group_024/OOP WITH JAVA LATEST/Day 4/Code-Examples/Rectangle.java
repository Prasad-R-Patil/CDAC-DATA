
public final class Rectangle extends Shape {
	private int length, breadth;
	public Rectangle() {
		// TODO Auto-generated constructor stub
		length = 20;
		breadth = 15;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a rectangle with length: " + length + " and breadth: " + breadth);

	}

	@Override
	public float findArea() {
		// TODO Auto-generated method stub
		float area = length * breadth;
		return area;
	}

}
