package object_class_demos;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 10;
		System.out.println("X == Y? " + (x == y));
		MobilePhone mobile = new MobilePhone("Samsung", "Galaxy", 18500);
		MobilePhone mobile2 = new MobilePhone("Samsung", "Galaxy", 18500);
		//MobilePhone mobile2 = mobile;
		System.out.println("mobile == mobile2? " + (mobile == mobile2));
		//When '==' is used for reference variables always memory addresses are checked and not the
		//contents (data)
		System.out.println("mobile.equals(mobile2) ? " + (mobile.equals(mobile2)));
		//If equals() is not overridden in the subclass, Object class equals() gets called 
		//Object class equals() works same as that of '=='

	}

}
