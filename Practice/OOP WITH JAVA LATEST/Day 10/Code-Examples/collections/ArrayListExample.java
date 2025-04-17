package collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList values = new ArrayList();
		values.add("Hello");
		values.add(200);
		values.add(34.76);
		
		System.out.println("------------Printing all the elements------------");
		for(Object obj : values) {
			System.out.println(obj);
		}
		
		System.out.println("3rd element is " + values.get(2));
		
		//Inserting an element somewhere in between
		values.add(2, "Test");
		System.out.println("-----------------");
		for(Object obj : values) {
			System.out.println(obj);
		}
	}

}







