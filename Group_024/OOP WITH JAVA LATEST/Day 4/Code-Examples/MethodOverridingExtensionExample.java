
public class MethodOverridingExtensionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Training tr = new OfflineTraining("Spring", 5, "Mumbai CDAC");
		String allDetails = tr.getDetails();
		System.out.println(allDetails);

	}

}
