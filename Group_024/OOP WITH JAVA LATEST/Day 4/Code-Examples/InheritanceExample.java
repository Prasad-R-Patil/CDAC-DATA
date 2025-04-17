
public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OfflineTraining offTrn = new OfflineTraining();
		offTrn.setModuleName("Core Java");
		offTrn.setDuration(10);
		offTrn.setVenue("CDAC, Pune");
		
		OnlineTraining onTrn = new OnlineTraining();
		onTrn.setModuleName("React");
		onTrn.setDuration(5);
		onTrn.setMeetingLink("http://oracle.zoom.us");
		onTrn.setSoftware("Zoom");
		
		//Remaining code to get the data and print
		System.out.println("Offline Training venue: " + offTrn.getVenue());
		System.out.println("Offline Training module: " + offTrn.getModuleName());
		
		System.out.println("===========Using Parameterized Constructors============");
		OfflineTraining oftrg = new OfflineTraining("Angular", 5, "CDAC, Mumbai");
		OnlineTraining ontrg = 
				new OnlineTraining("Python", 3, "MS Teams", "teams.org");
		//Remaining code to get and print the values

	}

}
