package language_essentials.inner_classes;

public class AnonymousInnerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating the Thread object by passing a reference of type Runnable as a target
		//using an Anonymous Inner Class
		Thread t1 = new Thread(new Runnable() {//Anonymous Inner Class Defn starts here			
			@Override
			public void run() {
				System.out.println("Test thread works...");				
			}
		});
		t1.start();
	}

}
