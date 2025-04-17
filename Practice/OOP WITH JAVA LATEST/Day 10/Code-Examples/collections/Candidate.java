package collections;

import java.util.ArrayList;
import java.util.List;

public class Candidate {
	private String name;
	private List<String> skills;

	public Candidate() {
		// TODO Auto-generated constructor stub
		name = "";
		skills = new ArrayList<String>();
	}

	public Candidate(String name, List<String> skills) {
		this.name = name;
		this.skills = skills;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	//Providing a utility method to add one single skill at a time
	public void addSkill(String skill) {
		skills.add(skill);//Adding a new skill to the existing list of skills		
	}
}








