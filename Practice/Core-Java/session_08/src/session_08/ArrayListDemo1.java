package session_08;

import java.util.ArrayList;

public class ArrayListDemo1 {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		
		a.add(10);
		a.add("A");
		a.add("ABC");
		a.add("C");
		a.add(10);
		
		for(Object o : a) {
			
			System.out.println(o);
			
		}
		
		
		//String str = (String)a.get(0);
		
		int i = (int) a.get(2);
	}
}
