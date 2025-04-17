package multithreading;

public class RunnableExample {

	public static void main(String[] args) {
		Runnable r1 = new GreetingRunnable("Hello",	2000);
		Runnable r2 = new GreetingRunnable("Welcome",	1000);
		//Setting Runnable as a target
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();

	}

}
