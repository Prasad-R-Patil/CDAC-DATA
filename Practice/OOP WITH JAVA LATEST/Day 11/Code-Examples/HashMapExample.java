package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Fruit> fruitsData = new HashMap<String, Fruit>();
		Fruit mango = new Fruit();
		Fruit apple = new Fruit("Apple", "Healthy");
		Fruit watermelon = new Fruit("Watermelon", "Perfect for Summer");
		
		//Putting all the 3 fruits as values with the associated keys as fruit codes
		fruitsData.put("fruit1", mango);
		fruitsData.put("fruit2", apple);
		fruitsData.put("fruit3", watermelon);
		
		//Fetching the information according to the keys
		Set<String> fruitCodes = fruitsData.keySet();//Returns Set of keys
		for(String code : fruitCodes) {
			//Pass the fruit code to get the fruit value
			Fruit fruit = fruitsData.get(code);
			System.out.println("Key: " + code + ", Value: " + fruit);
		}
		System.out.println("---------------------------------");
		//Fetching values directly
		Collection<Fruit> fruitValues = fruitsData.values();//Returns a Collection of values
		for(Fruit fr : fruitValues)
			System.out.println(fr);

	}

}







