
public class PetUsingThisExample {

	public static void main(String[] args) {
		Pet myPet = new Pet();
		System.out.println("Default Values: \n" + myPet.getPetInfo());
		
		myPet.assignValuesAgain("Tom", "Cat", 3);
		System.out.println("Changed Values: \n" + myPet.getPetInfo());
	}

}
