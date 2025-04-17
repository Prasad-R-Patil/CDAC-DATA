package multithreading;

public class GreetingRunnableUsingCurrentThreadExample {

	public static void main(String[] args) {
		Runnable r1 = new GreetingRunnableUsingCurrentThread();
		Runnable r2 = new GreetingRunnableUsingCurrentThread();
		Thread t1 = new Thread(r1, "first");
		Thread t2 = new Thread(r2, "second");
		t1.start();
		t2.start();
		try {
			//Call to join() causes the parent thread: main thread to wait until the death of the threads 
			//on which it is invoked
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("THANK YOU");

	}

}
