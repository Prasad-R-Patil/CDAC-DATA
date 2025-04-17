package session_08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo3 {
	
	
	
	
	
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		List<Integer> l=Collections.synchronizedList(a);
		
		System.out.println(l);
		System.out.println(l.addAll(a));
		System.out.println(l);
		
		
		
		
		System.out.println("---------------");
		
		
		l.clear();
		
		System.out.println(l);
		System.out.println(a);
		
		
		a.removeAll(l);
		System.out.println(a);
		System.out.println(l);
		
		System.out.println(10);
		
		
		List l1=new ArrayList<>();
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(a);

		System.out.println(l1);
		
		
		
		
		
		
		
		
		
		
	}

}
