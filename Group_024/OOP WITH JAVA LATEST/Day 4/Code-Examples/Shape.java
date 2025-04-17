
public  abstract class Shape {
	//Variables, Constructors and Static methods cannot be declared as abstract
	//'abstract' modifier can be applied for non-static methods and a class
	public abstract void draw();
	public abstract float findArea();
	public Shape() {
		System.out.println("Shape:no-arg");
	}
	public final void erase() {
		System.out.println("Erasing the shape");
	}
}
