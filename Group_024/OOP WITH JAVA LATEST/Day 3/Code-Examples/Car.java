
public class Car {
	private String make;
	private String model;
	private Engine engineDetails;//Composition
	private MusicSystem musicSystemDetails;//Aggregation
	public Car() {
		// This is a very basic car model which does not have Music System
		make = "Maruti";
		model = "800";
		//Initializing engine
		engineDetails = new Engine("Petrol", "800CC");
		//Not initializing musicSystemDetails because this car does not have that
	}
	public Car(String make, String model, Engine engineDetails, MusicSystem musicSystemDetails) {
		this.make = make;
		this.model = model;
		this.engineDetails = engineDetails;
		this.musicSystemDetails = musicSystemDetails;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Engine getEngineDetails() {
		return engineDetails;
	}
	public void setEngineDetails(Engine engineDetails) {
		this.engineDetails = engineDetails;
	}
	public MusicSystem getMusicSystemDetails() {
		return musicSystemDetails;
	}
	public void setMusicSystemDetails(MusicSystem musicSystemDetails) {
		this.musicSystemDetails = musicSystemDetails;
	}
	
	

}
