package example.multithreading.interthread.communication;

public class StorageExample {

	public static void main(String[] args) {
		Storage str = new Storage();//valueSet: false, num: 0
		Thread t1 = new StorageThread(str,"Producer");
		Thread t2 = new StorageThread(str,"Consumer");
		t1.start();
		t2.start();

	}

}

//if(!valueSet)

//if(valueSet)
