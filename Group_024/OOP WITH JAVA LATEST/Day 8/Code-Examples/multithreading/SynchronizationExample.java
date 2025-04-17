package multithreading;

public class SynchronizationExample {

	public static void main(String[] args) {
		Message msg = new Message("Hello Everyone !!");
		Thread t1 = new MessageThread(msg);
		Thread t2 = new MessageThread(msg);
		t1.start();
		t2.start();

	}

}
