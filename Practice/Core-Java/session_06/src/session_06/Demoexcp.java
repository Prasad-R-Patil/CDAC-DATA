package session_06;

public class Demoexcp {
	public static void Msg()
	{
		getMsg();
	}
	
	public static void getMsg()
	{
		int a=10/0;
		System.out.println("a= "+a);
	}
	
	public static void main(String[] args) {
		Demoexcp.Msg();
	}
}
