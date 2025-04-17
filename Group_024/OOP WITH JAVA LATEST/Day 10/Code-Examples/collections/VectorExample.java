package collections;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector values = new Vector();
		int size = values.size();
		int capacity = values.capacity();
		System.out.println("Size: " + size + ", Capacity: " + capacity);
		values.add("Hello");
		values.add(200);
		values.add(34.76);
		size = values.size();
		capacity = values.capacity();
		System.out.println("Size: " + size + ", Capacity: " + capacity);
		//Adding 8 more elements
		for(int a=1;a<=8;a++)
			values.add(a);
		size = values.size();
		capacity = values.capacity();
		System.out.println("Size: " + size + ", Capacity: " + capacity);
		
		System.out.println("------------Printing all the elements------------");
		for(Object obj : values) {
			System.out.println(obj);
		}
		
		System.out.println("3rd element is " + values.get(2));//Index starts from 0 and hence 2 --> Gives 3rd element
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
