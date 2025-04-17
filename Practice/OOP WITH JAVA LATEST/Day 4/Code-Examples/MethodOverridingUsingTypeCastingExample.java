
public class MethodOverridingUsingTypeCastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Training trg = new OfflineTraining();
		trg.setModuleName("Vue JS");
		trg.setDuration(3);
		//trg.setVenue("Pune"); Error because trg is of type Training (Static Type)
		//And compiler expects setVenue() in Training class which is missing
		
		//Solution: TypeCast trg of type Training into OfflineTraining
		OfflineTraining otrg = (OfflineTraining)trg; //Similar to int i = (int)f; where f is float
		otrg.setVenue("Pune");
		
		//Remaining code to get and print the values

	}

}
