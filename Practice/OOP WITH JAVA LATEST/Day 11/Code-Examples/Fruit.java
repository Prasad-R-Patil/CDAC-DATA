package collections;

import java.util.Objects;

public class Fruit {
	private String name;
	private String description;
	public Fruit() {
		name = "Mango";
		description = "King";
	}
	public Fruit(String name, String description) {
		this.name = name;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", description=" + description + "]";
	}
	@Override
	public int hashCode() {
		System.out.println("hashCode() invoked...");
		return Objects.hash(description, name);
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals) invoked()...");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(description, other.description) && Objects.equals(name, other.name);
	}
	

}
