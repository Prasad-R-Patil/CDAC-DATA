package multithreading;

public class CurrentThreadExample {

	public static void main(String[] args) {
		//Obtaining a handle to the currently running thread which is main thread
		Thread mainThread = Thread.currentThread();
		String name = mainThread.getName();
		System.out.println("Main thread name is " + name);
		//Stopping the main thread
		mainThread.stop();//Stops this thread hence the next line does not execute
		System.out.println("This message will not be printed");
		
	}

}
