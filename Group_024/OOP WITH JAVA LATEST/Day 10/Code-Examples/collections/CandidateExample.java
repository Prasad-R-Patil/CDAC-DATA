package collections;

import java.util.ArrayList;
import java.util.List;

public class CandidateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate cd = new Candidate();
		cd.setName("Gautam");
		List<String> skills = new ArrayList<String>();
		skills.add("Java");
		skills.add("Python");
		skills.add("Machine Learning");
		cd.setSkills(skills);
		
		Candidate cd2 = new Candidate();
		cd2.setName("Anu");
		cd2.addSkill("Blockchain");
		cd2.addSkill("CAD");
		
		System.out.println("Printing the candidate names along with their skills");
		String name1 = cd.getName();
		List<String> skillList1 = cd.getSkills();
		
		String name2 = cd2.getName();
		List<String> skillList2 = cd2.getSkills();
		
		System.out.println("Skills of " + name1 + " are: ");
		for(String sk : skillList1)
			System.out.println(sk);
		System.out.println("-----------------------------------");
		System.out.println("Skills of " + name2 + " are: ");
		for(String sk : skillList2)
			System.out.println(sk);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
