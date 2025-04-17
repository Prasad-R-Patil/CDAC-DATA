package assignment1;

public class Person {
	
	private String Name;
	private int Age;
	
	public Person()
	{
		Age=18;
		
	}
	
	public Person(String nm)
	{
		Name=nm;
		Age=18;
		
	}
	public Person(String nm,int ag)
	{
		Name=nm;
		Age=ag;
	}
	
	public void display()
	{
		System.out.println("Person info ["+Name+"  "+Age+"]");
	}
	
	public static void main(String[] args) {
		Person pn = new Person();
		pn.display();
		
		Person pn1 = new Person("prasad");
		pn1.display();
		
		Person pn2 = new Person("Sagar",20);
		
		pn2.display();
	}

}
