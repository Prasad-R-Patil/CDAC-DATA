package language_essentials.inner_classes;

public class Outer {
	
	private int x = 10;
	private static int y = 20;
	public static class StaticInner {//This is a Static Inner Class
		public void print() {
			//System.out.println(x);//This gives an error because variable 'x' is an instance variable
			System.out.println(y);
		}
	}
	public class NestedClass {//This is a Nested Class
		public void display() {
			System.out.println(x);
			System.out.println(y);
		}
	}
	
	public void show() {
		class Message {//This is a Local Class
			String greet(String user) {
				return "Welcome " + user;
			}
		}
		Message msg = new Message();
		String greeting = msg.greet("Jack");
		System.out.println(greeting);
	}
}
