
public class Planet {
	//2 Variables
	//7 Methods
	private String name;
	private int moons;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoons() {
		return moons;
	}
	public void setMoons(int moons) {
		this.moons = moons;
	}
	
	public void assignValues() {//Assigning default values
		name = "Earth";
		moons = 1;
	}
	
	public void assignValues(String pName, int pMoons) {
		//This is an overloaded assignValues(String, int)
		name = pName;
		moons = pMoons;
	}
	public void assignValues(int pMoons, String pName) {
		//This is an overloaded assignValues(int, String)
		name = pName;
		moons = pMoons;
	}
	
	
}
