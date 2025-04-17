package Assignment_02;

public class Product {
	private int pid;
	private int price;
	private int quantity;
	
	public Product()
	{
		
	}
	
	public Product(int id,int pr,int qu)
	{
		pid=id;
		price=pr;
		quantity=qu;
		
		
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString()
	{
		return "Product ="+pid+" "+price+" "+quantity+"";
	}
	
	
	public int highestPrise()
	{
		int m=0;
		for(int i=0;i<2;i++)
		{
			if(m<price)
			{
				m=price;
			}
			
		}
		return m;
	}
	
}
