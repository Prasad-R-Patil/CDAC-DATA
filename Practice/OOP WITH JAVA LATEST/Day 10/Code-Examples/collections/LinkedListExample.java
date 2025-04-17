package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList values = new LinkedList();
		values.add("Hello");
		values.add(200);
		values.add(34.76);
		values.add("Hello");
		values.add(200);
		values.add(34.76);
		System.out.println("------------Printing all the elements------------");
		for(Object obj : values) {
			System.out.println(obj);			
		}
		
		//Adding a new element directly at the TOP
		values.addFirst("Good Morning");
		System.out.println("------------Printing all the elements------------");
		for(Object obj : values) {
			System.out.println(obj);			
		}
		
		//Removing an element from the TOP
		values.removeFirst();
		System.out.println("------------Printing all the elements------------");
		for(Object obj : values) {
			System.out.println(obj);			
		}
	}

}







