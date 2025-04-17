package multithreading;
//This is the Thread implementation class
public class GreetingRunnableUsingCurrentThread implements Runnable{
	
	public void run() {
		for(int a=1;a<=10;a++) {
			Thread currThread = Thread.currentThread();
			String name = currThread.getName();
			if(name.equals("first")) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);//Sending the currently running thread into Sleeping State
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				System.out.println("Welcome");
				try {
					Thread.sleep(500);//Sending the currently running thread into Sleeping State
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}










