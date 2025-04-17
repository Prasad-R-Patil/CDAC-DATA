package language_essentials.inner_classes;

public class InnerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outerRef = new Outer();
		
		//Creating an object of Static Inner Class
		Outer.StaticInner staticInnerRef = new Outer.StaticInner();
		
		//Creating an object of Nested Class
		Outer.NestedClass nestedRef = outerRef.new NestedClass();
		
		//Calling the relevant methods:
		staticInnerRef.print();
		System.out.println("---------");
		nestedRef.display();
		System.out.println("---------");
		outerRef.show();

	}

}
