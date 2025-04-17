
public class FlowerUsingStaticExample {
	
	static {
		System.out.println("Application is about to begin...");
	}

	static public void main(String[] args) {
		System.out.println("Application begins...");
		// TODO Auto-generated method stub
		Flower f1 = new Flower();
		Flower f2 = new Flower("Sunflower", "Yellow");
		Flower f3 = new Flower("Lotus", "Pink");
		
		System.out.println("Current count of flowers: " + Flower.getFlowerCount());
		//Adding 5 more flowers
		for(int a=1;a<=5;a++) {
			Flower f = new Flower();
		}
		
		System.out.println("Latest count of flowers: " + Flower.getFlowerCount());

	}

}
