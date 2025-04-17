package language_essentials.enums;

import java.util.ArrayList;
import java.util.List;

public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<TrainingProgram> trainingPrograms = new ArrayList<TrainingProgram>();
		TrainingProgram program1 = new TrainingProgram();
		TrainingProgram program2 = new TrainingProgram("Java Frameworks", TrainingMode.ONLINE);
		TrainingProgram program3 = new TrainingProgram("DevOps", TrainingMode.ONLINE);
		TrainingProgram program4 = new TrainingProgram("Mastering UI", TrainingMode.HYBRID);
		TrainingProgram program5 = new TrainingProgram("Python and DJango", TrainingMode.HYBRID);

		trainingPrograms.add(program1);
		trainingPrograms.add(program2);
		trainingPrograms.add(program3);
		trainingPrograms.add(program4);
		trainingPrograms.add(program5);
		
		showHybridTrainingPrograms(trainingPrograms);
		
	}

	private static void showHybridTrainingPrograms(List<TrainingProgram> trainingPrograms) {
		// TODO Auto-generated method stub
		for(TrainingProgram prg : trainingPrograms) {
			TrainingMode currentTrainingMode = prg.getModeOfTraining();
			if(currentTrainingMode.equals(TrainingMode.HYBRID))
				System.out.println(prg);
		}
		
	}

}
