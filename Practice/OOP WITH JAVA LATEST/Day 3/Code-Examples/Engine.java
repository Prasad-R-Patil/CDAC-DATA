
public class Engine {
	private String type;//Petrol or Diesel
	private String power;//1200CC, 1400CC etc
	public Engine() {
		type = "Petrol";
		power = "1200 CC";
	}
	public Engine(String type, String power) {
		this.type = type;
		this.power = power;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	

}
