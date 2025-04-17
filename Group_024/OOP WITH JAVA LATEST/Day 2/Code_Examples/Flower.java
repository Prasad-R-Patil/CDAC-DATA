
public class Flower {
	private String name;//Instance Variable
	private String color;//Instance Variable
	private static int flowerCount;//Class Variable
	
	static {
		flowerCount = 100;
		System.out.println("Flower class loaded");
	}
	public Flower() {
		// TODO Auto-generated constructor stub
		flowerCount++;
	}
	public Flower(String name, String color) {
		this.name = name;
		this.color = color;
		flowerCount++;
	}
	
	static public int getFlowerCount() {//Modifiers may appear in any order
		return flowerCount;
	}
	//Remaining code e.g. getters, setters etc

}
