package session_08;

import java.util.ArrayList;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		System.out.println(a.isEmpty());
		
		a.add(10);
		//a.add("abc");
		a.add(null);
		a.add(20);
		//a.add(10.2);
		a.add(20);
		
		System.out.println(a);
		
		a.remove(3);
		
		System.out.println(a);
		
		System.out.println(a.get(2));
		
		System.out.println(a.size());
		
		
	}

}
