
public class EnumDemo2 {
	
	public enum Coffee{Small(45),Medium(60),Large(90);
	
	private int price;
	
	private Coffee(int price)
	{
		this.price=price;
	}
	
	public int grtPrice()
	{
		return price;
	}
	};
	
	public static void main(String[] args) {
		Coffee c=Coffee.Medium;
		System.out.println(c+"  "+c.grtPrice());
	}
}
