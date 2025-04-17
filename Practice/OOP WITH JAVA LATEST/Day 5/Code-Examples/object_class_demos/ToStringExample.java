package object_class_demos;

public class ToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100;
		System.out.println(x);
		
		MobilePhone mobile = new MobilePhone("Samsung", "Galaxy", 18500);
		System.out.println(mobile);
		//In the above statement, JRE identifies dynamic type of 'mobile' ---> MobilePhone
		//And checks for toString() method in the respective class. If found, invokes that
		//Otherwise invokes the method from its super class ----> Object
		
		//At line no 11, the call to toString() is implicit
		
		String mobileData = mobile.toString();//This is an explicit call
		System.out.println(mobileData);
		
		//In Java, there are some methods which get called implicitly by JRE. Such methods
		//are known as Callback methods e.g toString()

	}

}








