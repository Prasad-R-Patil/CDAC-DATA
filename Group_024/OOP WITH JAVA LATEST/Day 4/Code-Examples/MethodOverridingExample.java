
public class MethodOverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OfflineTraining ot = new OnlineTraining();
		//Siblings are incompatible with each other therefore the above statement raises compilation error
		
		Training currentTraining;
		currentTraining = new OfflineTraining();
		currentTraining.conductTraining();
		
		currentTraining = new OnlineTraining();
		currentTraining.conductTraining();
		
		System.out.println("=====Using polymorphic approach through array=======");
		Training trainings[] = new Training[2];
		trainings[0] = new OfflineTraining();
		trainings[1] = new OnlineTraining();
		for(Training tr : trainings)
			tr.conductTraining();

	}

}
