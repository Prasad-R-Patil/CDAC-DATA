package example.multithreading.interthread.communication;

public class StorageThread extends Thread {
	private Storage dataStorage;

	public StorageThread(Storage dataStorage, String name) {
		super(name);
		this.dataStorage = dataStorage;
	}
	public void run() {
		synchronized (dataStorage) {
			for(int a=1;a<=5;a++) {
				Thread currThread = Thread.currentThread();
				String tName = currThread.getName();
				if(tName.equals("Producer")) {
					dataStorage.setNum(a);
				}
				else if(tName.equals("Consumer")) {
					int square = dataStorage.getSquare();
					System.out.println("Square: " + square);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
	}
	
}
