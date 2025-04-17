
public class OfflineTraining extends Training {
	private String venue;
	public OfflineTraining() {
		System.out.println("OfflineTraining: no-arg");
	}
	public OfflineTraining(String module, int dur, String venueDetails) {
		super(dur, module); //Invokes parent class parameterized constructor with signature: int, String
		venue = venueDetails;//Assigns a value for the direct property: venue
		
	}
	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}
	@Override//Insists compiler to check whether it is correct overriding or not
	public void conductTraining() {
		System.out.println("Visit the venue and conduct the training");
	}
	@Override
	public String getDetails() {
		String basicDetails = super.getDetails();
		String offlineTrainingDetails = basicDetails + "\nVenue:  " + venue; 
		return  offlineTrainingDetails;
	}
	
}








