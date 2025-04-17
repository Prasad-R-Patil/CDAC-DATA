package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> fruitNames = new HashSet<String>();
		fruitNames.add("Mango");
		fruitNames.add("Apple");
		fruitNames.add("Banana");
		fruitNames.add("Watermelon");
		fruitNames.add("Orange");
		fruitNames.add("Banana");
		fruitNames.add("Watermelon");
		fruitNames.add("Banana");
		fruitNames.add("Watermelon");
		
		System.out.println("Printing fruit names: ");
		for(String fruit : fruitNames)
			System.out.println(fruit);
	}

}








