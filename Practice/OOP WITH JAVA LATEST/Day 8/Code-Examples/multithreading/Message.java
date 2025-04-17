package multithreading;

public class Message {
	private String content;

	public Message(String content) {
		this.content = content;
	}
	public void printMessage() throws InterruptedException{
		System.out.println("***************************");
		Thread.sleep(1000);
		System.out.println(content);
		Thread.sleep(1000);
		System.out.println("***************************");
		Thread.sleep(1000);
	}
	
	

}
