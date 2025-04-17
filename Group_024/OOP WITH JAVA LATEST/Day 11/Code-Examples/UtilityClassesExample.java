package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UtilityClassesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> socialMedia = Arrays.asList("Twitter", "Instagram", "Whatsapp", "Facebook");
		for(String sm : socialMedia)
			System.out.println(sm);
		
		System.out.println("---Sorting the elements-------");
		Collections.sort(socialMedia);
		for(String sm : socialMedia)
			System.out.println(sm);

	}

}







