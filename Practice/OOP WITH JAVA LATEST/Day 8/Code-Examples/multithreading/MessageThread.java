package multithreading;

public class MessageThread extends Thread {
	private Message messageObject;
	
	public MessageThread(Message messageObject) {
		this.messageObject = messageObject;
	}

	public void run() {
		synchronized (messageObject) {
			try {
				messageObject.printMessage();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
