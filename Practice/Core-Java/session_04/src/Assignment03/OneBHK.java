package Assignment03;

public class OneBHK {
	
	protected int roomArea;
	protected int hallArea;
	protected int price;
	
	
	
	public OneBHK() {}
	
	
	public OneBHK(int ra,int ha,int p)
	{
		roomArea=ra;
		hallArea=ha;
		price=p;
	}
	
	
	public void show()
	{
		
		System.out.println(" Room Area"+roomArea+" Hall Area"+hallArea+"  Price =->"+price);
	}


	public int getRoomArea() {
		return roomArea;
	}


	public int getHallArea() {
		return hallArea;
	}


	public int getPrice() {
		return price;
	}
	

}
