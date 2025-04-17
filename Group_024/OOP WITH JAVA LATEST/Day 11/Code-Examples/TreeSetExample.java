package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<String> movieNames = new TreeSet<>();
		movieNames.add("Speed");
		movieNames.add("Predator");
		movieNames.add("Drishyam 2");
		movieNames.add("Unchai");
		movieNames.add("Lagaan");
		//movieNames.add(100);
		System.out.println("Printing all the movie names: ");
		for(String name : movieNames)
			System.out.println(name);

	}

}
