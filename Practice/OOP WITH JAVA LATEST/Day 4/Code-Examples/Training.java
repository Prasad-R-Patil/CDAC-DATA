
public class Training {
	private String moduleName;
	private int duration; //Days	
	
	public Training() {
		System.out.println("Training: no-arg");
	}	
	public Training(String moduleName, int duration) {
		System.out.println("Training: param: String, int");
		this.moduleName = moduleName;
		this.duration = duration;
	}
	public Training(int duration, String moduleName) {
		System.out.println("Training: param: int, String");
		this.duration = duration;
		this.moduleName = moduleName;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public void conductTraining() {}
	
	public String getDetails() {
		String details = "Module: " + moduleName + "\nDuration (days): " + duration;
		return details;
	}
	
}








