package example.multithreading.interthread.communication;

public class Storage {
	private int num;
	private boolean valueSet;
	public void setNum(int num) {
		if(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.num = num;
		System.out.println("Set: " + num);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		valueSet = true;
		notify();		
	}
	public int getSquare() {
		if(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		valueSet = false;
		notify();
		return num * num;
	}	
}
