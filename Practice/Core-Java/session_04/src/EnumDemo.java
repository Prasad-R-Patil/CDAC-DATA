
public class EnumDemo {
	public enum sesons{winter,summer,rany}
	
	
	public static void main(String[] args) {
		sesons s=sesons.summer;
		System.out.println(s);
		
		for(sesons s1:sesons.values())
		{
			System.out.println(s1+"  "+s1.ordinal());
		}
	}
	
}
