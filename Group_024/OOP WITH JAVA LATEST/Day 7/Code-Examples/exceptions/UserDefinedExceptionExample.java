package exceptions;

public class UserDefinedExceptionExample {

	public static void main(String[] args) {
		try {
			int position = NameCollection.getPosition("Govinda");
			System.out.println("Position is " + position);
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		

	}

}
