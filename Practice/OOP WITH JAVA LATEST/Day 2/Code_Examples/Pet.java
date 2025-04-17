
public class Pet {
	private String name;
	private String type;
	private int age;
	public Pet() {
		name = "Alex";
		type = "Dog";
		age = 4;
	}
	public Pet(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void assignValues(String nm, String ty, int ag) {
		//Here variables nm, ty and ag are local variables.
		//They are not accessible outside the method: assignValues
		name = nm;
		type = ty;
		age = ag;
	}
	
	public void assignValuesAgain(String name, String type, int age) {
		//In this case local variable gets the highest priority
		//Due to this both the variables are taken from the local scope
		//To resolve the scope, it is necessary to use 'this' keyword
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	public String getPetInfo() {
		String petInfo = "Name: " + name + "\nType: " + type + "\nAge: " + age;
		return petInfo;
	}
	

}
