package multithreading;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new GreetingThread("Hello", 2000);
		Thread t2 = new GreetingThread("Welcome", 1000);
		t1.start();
		t2.start();

	}

}
