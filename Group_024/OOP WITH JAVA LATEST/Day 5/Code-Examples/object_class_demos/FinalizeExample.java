package object_class_demos;

public class FinalizeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1;a<=5;a++) {
			new MobilePhone();
		}
		//At this stage 5 objects will be eligible for Garbage Collection
		
		//Requesting a Garbage Collector to run
		System.gc();

	}

}
