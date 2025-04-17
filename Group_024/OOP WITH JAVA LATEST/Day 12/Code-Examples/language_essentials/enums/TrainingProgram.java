package language_essentials.enums;

public class TrainingProgram {
	private String name;
	private TrainingMode modeOfTraining;
	public TrainingProgram() {
		name = "Java Full Stack";
		modeOfTraining = TrainingMode.OFFLINE;
	}
	public TrainingProgram(String name, TrainingMode modeOfTraining) {
		this.name = name;
		this.modeOfTraining = modeOfTraining;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TrainingMode getModeOfTraining() {
		return modeOfTraining;
	}
	public void setModeOfTraining(TrainingMode modeOfTraining) {
		this.modeOfTraining = modeOfTraining;
	}
	@Override
	public String toString() {
		return "TrainingProgram [name=" + name + ", modeOfTraining=" + modeOfTraining + "]";
	}

}
