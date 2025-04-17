package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetUsingUserDefinedObjectExample {

	public static void main(String[] args) {
		Set<Fruit> allFruits = new HashSet<Fruit>();
		//Creating 3 individual Fruit objects
		Fruit mango = new Fruit();
		Fruit apple = new Fruit("Apple", "Healthy");
		Fruit watermelon = new Fruit("Watermelon", "Perfect for Summer");
		
		//Adding them into HashSet: allFruits
		allFruits.add(watermelon);
		allFruits.add(mango);
		allFruits.add(apple);
		
		System.out.println("Printing all fruits: ");
		for(Fruit currentFruit : allFruits)
			System.out.println(currentFruit);
		
		Fruit mangoAgain = new Fruit();
		Fruit appleAgain = new Fruit("Apple", "Healthy");
		//Adding the above objects into HashSet: allFruits
		allFruits.add(appleAgain);
		allFruits.add(mangoAgain);
		System.out.println("Printing all the fruits again: ");
		for(Fruit currentFruit : allFruits)
			System.out.println(currentFruit);
		

	}

}






