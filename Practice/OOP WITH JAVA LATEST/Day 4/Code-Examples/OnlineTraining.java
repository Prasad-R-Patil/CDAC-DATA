
public class OnlineTraining extends Training {
	private String software;//Zoom, MS Teams
	private String meetingLink;
	public OnlineTraining() {
		System.out.println("OnlineTraining: no-arg");
	}
	
	public OnlineTraining(String moduleName, int duration, String software, String meetingLink) {
		//If super is not used, it results into super(); due to this no-argument constructor gets invoked
		super(moduleName, duration);
		this.software = software;
		this.meetingLink = meetingLink;
		
	}

	public String getSoftware() {
		return software;
	}
	public void setSoftware(String software) {
		this.software = software;
	}
	public String getMeetingLink() {
		return meetingLink;
	}
	public void setMeetingLink(String meetingLink) {
		this.meetingLink = meetingLink;
	}
	public void conductTraining() {
		System.out.println("Use the training software, meetingLink and conduct the training");
	}

}
