package Assignment03;

public class TwoBHK extends OneBHK{
	
	protected int room2Area;
	
	
	public TwoBHK() {}
	
	public TwoBHK(int ra,int ha,int rta,int p)
	{
		super(ra,ha,p);
		
		room2Area=rta;
		
	}
	
	
	
  public int getRoom2Area() {
		return room2Area;
	}

public void show(TwoBHK[] rm)
  {
	  super.show();
	  for(int i=0;i<rm.length;i++)
		{
			System.out.println("------------------------------------------------------------");
			System.out.println(" RoomOneArea =>"+rm[i].getRoomArea()+"");
			System.out.println(" Hall Area =>"+rm[i].getHallArea()+"");
			System.out.println(" RoomTwoArea =>"+rm[i].getRoom2Area()+"");
			System.out.println(" Price =>"+rm[i].getPrice()+"");
			System.out.println("------------------------------------------------------------");

		}
	 // System.out.println(" room2Area :->"+room2Area);
  }

}
