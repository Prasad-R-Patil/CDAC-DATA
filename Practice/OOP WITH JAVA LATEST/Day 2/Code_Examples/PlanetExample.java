
public class PlanetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planet p1 = new Planet();
		Planet p2 = new Planet();
		Planet p3 = new Planet();
		
		p1.assignValues();//Assigning default values
		p2.assignValues("Mars", 2);
		p3.assignValues(14, "Saturn");
		
		//Remaining code to get and print the values
		
		System.out.println(p2.getName());

	}

}
