
public class SimpleArrayExample {

	public static void main(String[] args) {
		// Declaring an array of 3 integers
		int numbers[] = new int[3];
		//Initializing the array with some values
		numbers[0] = 75;
		numbers[1] = 275;
		numbers[2] = 175;
		for(int index=0;index<3;index++) {
			int num = numbers[index];
			System.out.println(num);
		}
		
		//Declaring and Initializing an array of Strings simultaneously
		String riverNames[] = 
			{"Ganga", "Yamuna", "Kaveri", "Godavari", "Brahmaputra"};
		//Obtaining the size of the array
		int size = riverNames.length;
		for(int index = 0; index < size; index++)
			System.out.println(riverNames[index]);
		System.out.println("------------------------------------");
		//Printing the river names using Enhanced For Loop (For-Each)
		for(String river : riverNames)
			System.out.println(river.toUpperCase());

	}

}
