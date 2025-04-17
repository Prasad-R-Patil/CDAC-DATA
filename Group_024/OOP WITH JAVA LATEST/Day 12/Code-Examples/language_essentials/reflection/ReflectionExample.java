package language_essentials.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import collections.Movie;

public class ReflectionExample {
	private static void createObject(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class cls = Class.forName(className);//Loads the class explicitly
		System.out.println("Class loaded");
		cls.newInstance();//Creates an instance of the class that is loaded
	}
	private static void printClassInfo(Object obj) {
		Class currentClass = obj.getClass();
		String className = currentClass.getName();
		System.out.println("Class name: " + className);
		System.out.println("-------Printing names of the methods-----------");
		Method methods[] = currentClass.getDeclaredMethods();
		for(Method mt : methods) {
			String methodName = mt.getName();
			System.out.println(methodName);
		}
		
		System.out.println("---------Printing names of the fields-------------");
		Field fields[] = currentClass.getDeclaredFields();
		for(Field f : fields) {
			String fieldName = f.getName();
			System.out.println(fieldName);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printClassInfo(new Movie());
		try {
			createObject("collections.Movie");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
