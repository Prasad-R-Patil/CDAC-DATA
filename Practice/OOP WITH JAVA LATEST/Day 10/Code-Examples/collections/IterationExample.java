package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List names = new ArrayList();
		names.add("Ram");
		names.add("Seeta");
		names.add("Raavan");
		names.add("Hanuman");
		
		//Obtaining an Iterator on the underlying collection: names
		Iterator namesIt = names.iterator();
		while(namesIt.hasNext()) {//Checks whether the next element is available or not
			Object obj = namesIt.next();//Returns the next element and shifts the cursor 1 step ahead
			System.out.println(obj);
		}
		
		System.out.println("---------------Performing Removal of Raavan-----------");
		namesIt = names.iterator();
		while(namesIt.hasNext()) {
			Object obj = namesIt.next();
			if(obj.equals("Raavan"))
				namesIt.remove();
		}
		for(Object name : names)
			System.out.println(name);
		
		System.out.println("--------Performing Reverse Traversal using ListIterator--------------");
		int size = names.size();
		ListIterator namesListIt = names.listIterator(size);
		while(namesListIt.hasPrevious()) {
			Object obj = namesListIt.previous();
			System.out.println(obj);
		}
	}

}



















