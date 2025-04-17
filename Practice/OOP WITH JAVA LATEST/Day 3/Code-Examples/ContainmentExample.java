
public class ContainmentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car basicCar = new Car();//This car does not have music system
		
		//Creating a premium car with music system
		Engine premiumEngine = new Engine("Diesel", "2600 CC");
		MusicSystem premiumMusicSystem = new MusicSystem("Sony", "Dolby with Woofers");
		Car premiumCar = 
				new Car("Toyota", "Innova ZX", premiumEngine, premiumMusicSystem);
		
		//---------------Fetching the Information
		//Car Model
		System.out.println("Model of basic car: " + basicCar.getModel());
		//Car's Engine's Power
		//This can be done by 2 ways:
		//1. Explicit Reference Technique
		//First obtain the Engine associated with the car and then obtain the power
		Engine basicEngine = basicCar.getEngineDetails();
		String basicPower = basicEngine.getPower();
		String fuelType = basicEngine.getType();
		System.out.println("Power of the engine available in basic car: " + basicPower);
		System.out.println("Type of the engine available in basic car: " + fuelType);
		System.out.println("-------------------------");
		//2. Object Graph Navigation
		basicPower = basicCar.getEngineDetails().getPower();
		//int x = basicCar.getEngineDetails().getPower().length();
		fuelType = basicCar.getEngineDetails().getType();
		System.out.println("Power of the engine available in basic car: " + basicPower);
		System.out.println("Type of the engine available in basic car: " + fuelType);
		
		//Fetching the sound effect of the music system of premium car
		String soundEffect = premiumCar.getMusicSystemDetails().getSoundEffect();
		System.out.println("Sound effect of music system in premium car: " + soundEffect);
		
		//Fetching the sound effect of the music system of basic car
		//soundEffect = basicCar.getMusicSystemDetails().getSoundEffect();
		//System.out.println("Sound effect of music system in basic car: " + soundEffect);
		//The above code results into NullPointerException because basicCar's musicSystem is null
		System.out.println("****************************");
		MusicSystem ms = premiumCar.getMusicSystemDetails();
		if(ms != null)
			System.out.println(ms.getSoundEffect());
		
		

	}

}







