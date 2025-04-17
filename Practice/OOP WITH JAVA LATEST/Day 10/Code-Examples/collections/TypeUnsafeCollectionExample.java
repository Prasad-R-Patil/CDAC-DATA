package collections;

import java.util.ArrayList;
import java.util.List;

public class TypeUnsafeCollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List countryNames = new ArrayList();
		countryNames.add("India");
		countryNames.add("Japan");
		countryNames.add("Sri Lanka");
		countryNames.add("Australia");
		countryNames.add("South Korea");
		countryNames.add(1000);
		for(Object obj: countryNames) {
			String country = (String)obj;
			System.out.println(country.toUpperCase());
		}

	}

}










