package multithreading;
//This is the Thread implementation class
public class GreetingRunnable implements Runnable{
	private String greetingMessage;
	private int delayTime;//In Milliseconds
	
	public GreetingRunnable(String greetingMessage, int delayTime) {
		this.greetingMessage = greetingMessage;
		this.delayTime = delayTime;
	}

	public void run() {
		for(int a=1;a<=10;a++) {
			System.out.println(greetingMessage);
			//Introduce a time gap
			try {
				Thread.sleep(delayTime);//Sending the currently running thread into Sleeping State
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}










