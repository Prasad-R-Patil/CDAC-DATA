package collections;

import java.util.ArrayList;
import java.util.List;

public class TypeSafeCollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> countryNames = new ArrayList<>();
		//The above statement declares the collection as Type-Safe.
		//It tells the compiler that it will contain objects of type String only.
		countryNames.add("India");
		countryNames.add("Japan");
		countryNames.add("Sri Lanka");
		countryNames.add("Australia");
		countryNames.add("South Korea");
		//countryNames.add(1000);
		//Since compiler knows that the collection holds only Strings, no explicit casting is required
		for(String country : countryNames) {
			System.out.println(country.toUpperCase());
		}

	}

}










