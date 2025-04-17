package collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack values = new Stack();
		//Adding some elements
		values.add("Welcome");
		values.add(true); // values.add(new Boolean(true));
		values.push(45.23);//Double
		values.push(100); //Integer
		values.push(50.34f);//Float
		int currentSize = values.size();//Obtain the no. of elements
		System.out.println("Current Size: " + currentSize);
		
		Object poppedObject =  values.pop();//Removes the element from the TOP
		 int newSize = values.size();
		System.out.println(poppedObject);
		System.out.println("New size: " + newSize);
		
		Object peekedObject = values.peek();//Returns the element from the TOP but does not remove it
		System.out.println(peekedObject);
		int sizeAfterPeek = values.size();
		System.out.println("Size after Peek: " + sizeAfterPeek);
		
		System.out.println("--------Printing all the elements------------");
		for(Object obj : values) {
			System.out.println(obj);
		}

	}

}
